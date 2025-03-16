package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CouponDetailsCouponDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("cpnNumber")})
    @lombok.Setter(onMethod_ = {@JsonProperty("cpnNumber")})
    private String cpnNumber;
}
