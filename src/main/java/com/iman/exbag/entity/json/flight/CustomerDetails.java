package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CustomerDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("paxDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("paxDetails")})
    private PaxDetails paxDetails;
    @lombok.Getter(onMethod_ = {@JsonProperty("otherPaxDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("otherPaxDetails")})
    private OtherPaxDetails otherPaxDetails;
}
