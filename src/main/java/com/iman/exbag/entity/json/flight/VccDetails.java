package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class VccDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("creditCardDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("creditCardDetails")})
    private Object creditCardDetails;
}
