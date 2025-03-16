package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PreviousTickets {
    @lombok.Getter(onMethod_ = {@JsonProperty("ticketDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("ticketDetails")})
    private PreviousTicketsTicketDetails ticketDetails;
    @lombok.Getter(onMethod_ = {@JsonProperty("couponDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("couponDetails")})
    private CandidateETicketCouponDetails couponDetails;
    @lombok.Getter(onMethod_ = {@JsonProperty("dumPreviousTkt")})
    @lombok.Setter(onMethod_ = {@JsonProperty("dumPreviousTkt")})
    private Object dumPreviousTkt;
    @lombok.Getter(onMethod_ = {@JsonProperty("ticketCarrierCode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("ticketCarrierCode")})
    private AirlineCode ticketCarrierCode;
}
