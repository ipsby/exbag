package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BaggageAllowance {
    @lombok.Getter(onMethod_ = {@JsonProperty("checkedBaggageDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("checkedBaggageDetails")})
    private CheckedBaggageDetails checkedBaggageDetails;
}
