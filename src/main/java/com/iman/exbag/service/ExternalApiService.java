package com.iman.exbag.service;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.iman.exbag.entity.Booking;
import com.iman.exbag.entity.Flight;
import com.iman.exbag.entity.Pax;
import com.iman.exbag.entity.json.flight.FlightJSON;
import com.iman.exbag.repository.BookingRepository;
import com.iman.exbag.repository.FlightRepository;
import com.iman.exbag.repository.PaxRepository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalApiService {

    @Autowired
    private FlightRepository flightRepository;
    
    @Autowired
    private BookingRepository bookingRepository;
    
    @Autowired
    private PaxRepository paxRepository;

	@Value("${flight.list.url}")
	private String flightListUrl;

	@Value("${booking.list.url}")
	private String bookingListUrl;
  
    public String processingFlight(String beginDate, String endDate, String oriPort, String desPort) {
    	//format date yyyy-mm-dd
    	String tglMulai[] = beginDate.split("-");
    	String tglSelesai[] = endDate.split("-");   	
    	//String externalApiUrl = "https://sapp-api.asyst.co.id/exbag-dcs-dev/DCSLST_FlightListDisplay";
    	String bearerToken = "810859fc-7b18-3d2f-a79c-eb9712d236ec";
    	String jsonBody = String.format("{ \"data\": { \"carrier\": { \"companyIdentification\": { \"operatingCompany\": \"GA\" } }, \"searchPeriod\": { \"businessSemantic\": \"SDT\", \"beginDateTime\": { \"year\": %s, \"month\": %s, \"day\": %s, \"hour\": 0, \"minutes\": 1 }, \"endDateTime\": { \"year\": %s, \"month\": %s, \"day\": %s, \"hour\": 23, \"minutes\": 59 } }, \"portCode\": [ { \"airportCode\": \"%s\" }, { \"airportCode\": \"%s\" } ], \"displayType\": { \"statusInformation\": { \"indicator\": \"DD\" } } } }", 
    			tglMulai[0], tglMulai[1], tglMulai[2], tglSelesai[0], tglSelesai[1], tglSelesai[2], oriPort, desPort);
    	
    	HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(bearerToken);
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("env", "PDT"); // Add additional headers if needed
        //headers.set("oid", "JKTGA0605");
		headers.set("oid", "CGKGA00CM");

        String responseBody = this.requestApiJson(flightListUrl, headers, jsonBody);
        List<Flight> flights = parseFlightJson(responseBody);
		List<Flight> f = flightRepository.saveAll(flights);
        return f.size() + " rows processed.";
    }
    
    public String processingBooking(String flightNo, String depDate, String boardPoint) {
    	//format date yyyyMMdd
    	//String externalApiUrl = "https://sapp-api.asyst.co.id/exbag-dcs-dev/DCSLST_GetPassengerList";
    	String bearerToken = "810859fc-7b18-3d2f-a79c-eb9712d236ec";
    	String jsonBody = String.format("{ \"data\": { \"flightInfo\": { \"carrierDetails\": { \"marketingCarrier\": \"GA\" }, \"flightDetails\": { \"flightNumber\": %s }, \"departureDate\": \"%s\", \"boardPoint\": \"%s\" } } }", 
    			flightNo, depDate, boardPoint);
    	
    	HttpHeaders headers = new HttpHeaders();
        headers.setBearerAuth(bearerToken);
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("env", "PDT"); // Add additional headers if needed
        headers.set("oid", "JKTGA0605");
        
        String responseBody = this.requestApiJson(bookingListUrl, headers, jsonBody);
        List<Booking> bookings = parseBookingJson(responseBody);
		List<Booking> b = this.saveAllBooking(bookings);
        
        return b.size() + " rows processed.";
    }

    private String requestApiJson(String url, HttpHeaders htHeaders, String jsonBody) {
        // Create HTTP entity
        HttpEntity<String> requestEntity = new HttpEntity<>(jsonBody, htHeaders);

        // Send POST request
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(
                url,
                HttpMethod.POST,
                requestEntity,
                String.class
        );

        if (response.getStatusCode() == HttpStatus.OK) {
            return response.getBody();
        } else {
            throw new RuntimeException("Failed to fetch data from external API");
        }
    }
    
    private Date convertTextToDate(String tgl, String format) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		return formatter.parse(tgl);
    }

	private java.sql.Date convertTextToSqlDate(String tgl, String format) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		java.util.Date utilDate = formatter.parse(tgl);
		return new java.sql.Date(utilDate.getTime());
	}
    
    private List<Booking> saveAllBooking(List<Booking> bookings) {
    	List<Booking> savedBookings = new ArrayList<Booking>();
    	for (Booking booking : bookings) {
            savedBookings.add(bookingRepository.save(booking));
        }
    	return savedBookings;
    }
    
    private List<Flight> parseFlightJson(String json) {
    	try {
    		ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(json);

            // Extract array data
            JsonNode dataNode = rootNode.path("data").path("flights");
            List<Flight> flights = new ArrayList<>();
            for (JsonNode item : dataNode) {
            	Flight flight = new Flight();

            	flight.setFlightNo(item.path("flightId").path("flightDetails").path("flightNumber").asText());
            	flight.setOperatingCarrier(item.path("flightId").path("flightDetails").path("operatingCarrier").asText());
            	flight.setBoardPoint(item.path("flightId").path("boardPoint").asText());
            	flight.setOffPoint(item.path("flightId").path("offPoint").asText());
				flight.setDepartureDate(convertTextToSqlDate(item.path("flightId").path("departureDate").asText(), "yyyyMMdd"));
            	
            	java.sql.Timestamp saiki = new java.sql.Timestamp(Calendar.getInstance().getTimeInMillis());
            	flight.setCreatedAt(saiki);
            	flight.setUpdatedAt(saiki);
            	
                flights.add(flight);
            }

            // Save to database
            flightRepository.saveAll(flights);
            return flights;
    	} catch (Exception e) {
    		throw new RuntimeException("Failed to parse JSON", e);
    	}
    }
       
    private List<Booking> parseBookingJson(String json) {
    	try {
    		ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(json);

            // Extract array data
            JsonNode dataNode = rootNode.path("data").path("flightDetailsGroup").path("customerLevel");
            List<Booking> bookings = new ArrayList<Booking>();
            for (JsonNode item : dataNode) {
            	Pax pax = new Pax();
            	//customerData.paxDetails.surname + ' ' + customerData.otherPaxDetails.givenName
            	pax.setPaxName(item.path("customerData").path("paxDetails").path("surname").asText() + " " + item.path("customerData").path("otherPaxDetails").path("givenName").asText());
            	//uniqueCustomerId.idSection.primeId
            	pax.setPaxNik(item.path("uniqueCustomerId").path("idSection").path("primeId").asText());
            	//productLevel.flightInformation.flightDate.departureDate
            	java.sql.Date flightDate = new java.sql.Date(convertTextToDate(item.path("productLevel").path("flightInformation").path("flightDate").path("departureDate").asText(), "yyyyMMdd").getTime());
            	pax.setDepartureDate(flightDate);
            	//productLevel.flightInformation.boardPointDetails.trueLocationId
            	
            	pax.setDepartureAirport(item.path("productLevel").path("flightInformation").path("boardPointDetails").path("trueLocationId").asText());
            	//productLevel.flightInformation.offpointDetails.trueLocationId
            	pax.setDestinationAirport(item.path("productLevel").path("flightInformation").path("offpointDetails").path("trueLocationId").asText());
            	//productLevel.flightInformation.flightIdentification.flightNumber
            	String flightNo = item.path("productLevel").path("flightInformation").path("flightIdentification").path("flightNumber").asText();
            	pax.setFlightNo(flightNo);
            	pax.setTicketNo("");
            	pax.setTicketType("");
            	pax.setGaMilesNo("");
            	pax.setGaMilesTier("");
            	pax.setFreeBagAllow(20);
            	pax.setTotalBagWeight(0.0);
            	java.sql.Timestamp saiki = new java.sql.Timestamp(Calendar.getInstance().getTimeInMillis());
            	pax.setCreatedAt(saiki);
            	pax.setUpdatedAt(saiki);
            	pax.setDeletedAt(null);
            	
            	//productLevel.sbrRecordLocator.reservation.controlNumber
            	String pnrCode = item.path("productLevel").path("sbrRecordLocator").path("reservation").path("controlNumber").asText();
            	
            	List<Booking> dbBookings = bookingRepository.findByPnrCode(pnrCode);
            	if (CollectionUtils.isEmpty(dbBookings)) {
            		Optional<Booking> foundBooking = bookings.stream()
                			.filter(booking -> pnrCode.equals(booking.getPnrCode())).findAny();
            		if (foundBooking.isPresent()) {
                		Booking mBooking = foundBooking.get();
                		pax.setBooking(mBooking);
                		List<Pax> mPaxes = mBooking.getPaxes();
                 		if (CollectionUtils.isEmpty(mPaxes)) {
                			mPaxes = new ArrayList<Pax>();
                			mPaxes.add(pax);
                		} else {
                			mPaxes.add(pax);
                		}
                		mBooking.setPaxes(mPaxes);
                	} else {
                		Booking booking = new Booking();
                		booking.setPnrCode(pnrCode);
                		booking.setFlightCode(flightNo);
                		booking.setFlightDate(flightDate);
                		booking.setCreatedAt(saiki);
                    	booking.setUpdatedAt(saiki);
                    	booking.setDeletedAt(null);
                    	
                    	pax.setBooking(booking);
                		List<Pax> paxes = new ArrayList<Pax>();
                		paxes.add(pax);
                		
                    	booking.setPaxes(paxes);               		
                		bookings.add(booking);
                	}
            	} else {
            		Booking dbBooking = dbBookings.get(0);
            		pax.setBooking(dbBooking);
            		paxRepository.save(pax);
            	}
            }
            
            return bookings;
    	} catch (Exception e) {
    		throw new RuntimeException("Failed to parse JSON", e);
    	}
    }
    
    private String parseBookingJsonNeo(String json) throws JsonMappingException, JsonProcessingException {
    	ObjectMapper mapper = new ObjectMapper();
    	DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
    	mapper.setDateFormat(df);
    	        
    	FlightJSON FlightJson = mapper.readValue(json, FlightJSON.class);
    	return FlightJson.toString();
    }
}