package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CarrierDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("marketingCarrier")})
    @lombok.Setter(onMethod_ = {@JsonProperty("marketingCarrier")})
    private String marketingCarrier;
}
