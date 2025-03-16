package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ReferenceDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("type")})
    @lombok.Setter(onMethod_ = {@JsonProperty("type")})
    private String type;
    @lombok.Getter(onMethod_ = {@JsonProperty("value")})
    @lombok.Setter(onMethod_ = {@JsonProperty("value")})
    private String value;
}
