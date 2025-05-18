package com.iman.exbag;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iman.exbag.entity.Booking;
import com.iman.exbag.entity.Pax;
import com.iman.exbag.service.BookingService;

@SpringBootTest
class ExbagApplicationTests {

	@Autowired
    private BookingService bookingService;
	
	@Test
	public void testInputBooking() throws ParseException {
		java.util.Date tgl = new SimpleDateFormat("yyyymmdd", Locale.ENGLISH).parse("20250310");
		java.sql.Date flightDate = new java.sql.Date(tgl.getTime());
		java.sql.Timestamp saiki = new java.sql.Timestamp(Calendar.getInstance().getTimeInMillis());
		
		Booking booking = new Booking();
		booking.setPnrCode("6FY2RO");
		booking.setFlightCode("304");
		booking.setFlightDate(flightDate);
		booking.setCreatedAt(saiki);
    	booking.setUpdatedAt(saiki);
    	booking.setDeletedAt(null);
    	
    	Pax pax = new Pax();
    	pax.setPaxName("Kucing");
    	pax.setPaxNik("510EB439000081E9");
    	pax.setDepartureDate(flightDate);
    	pax.setDepartureAirport("CGK");
    	pax.setDestinationAirport("SUB");
    	pax.setFlightNo("304");
    	pax.setTicketNo("");
    	pax.setTicketType("");
    	pax.setGaMilesNo("");
    	pax.setGaMilesTier("");
    	pax.setFreeBagAllow(20);
    	pax.setTotalBagWeight(0.0);
    	pax.setCreatedAt(saiki);
    	pax.setUpdatedAt(saiki);
    	pax.setDeletedAt(null);
    	pax.setBooking(booking);
    	
    	List<Pax> paxes = new ArrayList<Pax>();
		paxes.add(pax);
    	booking.setPaxes(paxes);
    	
    	Booking savedBooking = bookingService.createBooking(booking);
    	assertNotNull(savedBooking.getId());
    	assertEquals(1, savedBooking.getPaxes().size());
	}

	@Test
	public void testCariBooking() {
		List<Booking> foundBookings = bookingService.getBookingsByPnrCode("6FY2RO");
		assertEquals(2, foundBookings.size());
	}
	
	@Test
	public void testGetAllBookings() {
		List<Booking> foundBookings = bookingService.getAllBookings();
		assertEquals(2, foundBookings.size());
	}
}
