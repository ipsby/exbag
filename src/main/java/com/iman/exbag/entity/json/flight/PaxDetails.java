package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PaxDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("surname")})
    @lombok.Setter(onMethod_ = {@JsonProperty("surname")})
    private String surname;
    @lombok.Getter(onMethod_ = {@JsonProperty("type")})
    @lombok.Setter(onMethod_ = {@JsonProperty("type")})
    private String type;
}
