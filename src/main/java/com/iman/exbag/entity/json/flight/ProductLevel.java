package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class ProductLevel {
    @lombok.Getter(onMethod_ = {@JsonProperty("operatingFlightDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("operatingFlightDetails")})
    private OperatingFlightDetails operatingFlightDetails;
    @lombok.Getter(onMethod_ = {@JsonProperty("productIdentifiers")})
    @lombok.Setter(onMethod_ = {@JsonProperty("productIdentifiers")})
    private List<UniqueCustomerID> productIdentifiers;
    @lombok.Getter(onMethod_ = {@JsonProperty("productRecordLocator")})
    @lombok.Setter(onMethod_ = {@JsonProperty("productRecordLocator")})
    private ProductRecordLocator productRecordLocator;
    @lombok.Getter(onMethod_ = {@JsonProperty("dumTXFSep")})
    @lombok.Setter(onMethod_ = {@JsonProperty("dumTXFSep")})
    private Object dumTXFSep;
    @lombok.Getter(onMethod_ = {@JsonProperty("handlingCarrier")})
    @lombok.Setter(onMethod_ = {@JsonProperty("handlingCarrier")})
    private HandlingCarrier handlingCarrier;
    @lombok.Getter(onMethod_ = {@JsonProperty("handlingSystem")})
    @lombok.Setter(onMethod_ = {@JsonProperty("handlingSystem")})
    private HandlingSystem handlingSystem;
    @lombok.Getter(onMethod_ = {@JsonProperty("bookingStatusDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("bookingStatusDetails")})
    private BookingStatusDetails bookingStatusDetails;
    @lombok.Getter(onMethod_ = {@JsonProperty("bookedCabinCode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("bookedCabinCode")})
    private BookedCabinCode bookedCabinCode;
    @lombok.Getter(onMethod_ = {@JsonProperty("productLevelIndicators")})
    @lombok.Setter(onMethod_ = {@JsonProperty("productLevelIndicators")})
    private ProductLevelIndicators productLevelIndicators;
    @lombok.Getter(onMethod_ = {@JsonProperty("flightStatuses")})
    @lombok.Setter(onMethod_ = {@JsonProperty("flightStatuses")})
    private CustomerIndicators flightStatuses;
    @lombok.Getter(onMethod_ = {@JsonProperty("statusSep")})
    @lombok.Setter(onMethod_ = {@JsonProperty("statusSep")})
    private Object statusSep;
    @lombok.Getter(onMethod_ = {@JsonProperty("baggageAllowance")})
    @lombok.Setter(onMethod_ = {@JsonProperty("baggageAllowance")})
    private BaggageAllowance baggageAllowance;
    @lombok.Getter(onMethod_ = {@JsonProperty("regProductStatus")})
    @lombok.Setter(onMethod_ = {@JsonProperty("regProductStatus")})
    private CustomerIndicators regProductStatus;
    @lombok.Getter(onMethod_ = {@JsonProperty("tickets")})
    @lombok.Setter(onMethod_ = {@JsonProperty("tickets")})
    private List<Ticket> tickets;
    @lombok.Getter(onMethod_ = {@JsonProperty("dumTktAndPreviousTkt")})
    @lombok.Setter(onMethod_ = {@JsonProperty("dumTktAndPreviousTkt")})
    private Object dumTktAndPreviousTkt;
    @lombok.Getter(onMethod_ = {@JsonProperty("previousTickets")})
    @lombok.Setter(onMethod_ = {@JsonProperty("previousTickets")})
    private PreviousTickets previousTickets;
    @lombok.Getter(onMethod_ = {@JsonProperty("revenueIntegrity")})
    @lombok.Setter(onMethod_ = {@JsonProperty("revenueIntegrity")})
    private RevenueIntegrity revenueIntegrity;
    @lombok.Getter(onMethod_ = {@JsonProperty("disruptionInfo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("disruptionInfo")})
    private DisruptionInfo disruptionInfo;
    @lombok.Getter(onMethod_ = {@JsonProperty("estimateTimes")})
    @lombok.Setter(onMethod_ = {@JsonProperty("estimateTimes")})
    private List<EstimateTime> estimateTimes;
    @lombok.Getter(onMethod_ = {@JsonProperty("vccDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("vccDetails")})
    private VccDetails vccDetails;
    @lombok.Getter(onMethod_ = {@JsonProperty("candidateETickets")})
    @lombok.Setter(onMethod_ = {@JsonProperty("candidateETickets")})
    private List<CandidateETicket> candidateETickets;
    @lombok.Getter(onMethod_ = {@JsonProperty("legLevel")})
    @lombok.Setter(onMethod_ = {@JsonProperty("legLevel")})
    private List<LegLevel> legLevel;
    @lombok.Getter(onMethod_ = {@JsonProperty("dummySegmentTXF")})
    @lombok.Setter(onMethod_ = {@JsonProperty("dummySegmentTXF")})
    private Object dummySegmentTXF;
    @lombok.Getter(onMethod_ = {@JsonProperty("paymentPendingInd")})
    @lombok.Setter(onMethod_ = {@JsonProperty("paymentPendingInd")})
    private PaymentPendingInd paymentPendingInd;
}
