package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Ticket {
    @lombok.Getter(onMethod_ = {@JsonProperty("ticketDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("ticketDetails")})
    private TicketTicketDetails ticketDetails;
    @lombok.Getter(onMethod_ = {@JsonProperty("dumtkt")})
    @lombok.Setter(onMethod_ = {@JsonProperty("dumtkt")})
    private Object dumtkt;
    @lombok.Getter(onMethod_ = {@JsonProperty("couponDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("couponDetails")})
    private CandidateETicketCouponDetails couponDetails;
}
