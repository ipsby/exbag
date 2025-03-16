package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CandidateETicket {
    @lombok.Getter(onMethod_ = {@JsonProperty("ticketInfo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("ticketInfo")})
    private TicketInfo ticketInfo;
    @lombok.Getter(onMethod_ = {@JsonProperty("couponDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("couponDetails")})
    private CandidateETicketCouponDetails couponDetails;
}
