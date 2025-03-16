package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CandidateETicketCouponDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("couponDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("couponDetails")})
    private CouponDetailsCouponDetails couponDetails;
}
