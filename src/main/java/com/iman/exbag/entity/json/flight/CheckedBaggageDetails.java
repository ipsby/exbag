package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CheckedBaggageDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("weight")})
    @lombok.Setter(onMethod_ = {@JsonProperty("weight")})
    private String weight;
}
