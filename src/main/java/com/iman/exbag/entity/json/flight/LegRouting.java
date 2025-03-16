package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LegRouting {
    @lombok.Getter(onMethod_ = {@JsonProperty("origin")})
    @lombok.Setter(onMethod_ = {@JsonProperty("origin")})
    private String origin;
    @lombok.Getter(onMethod_ = {@JsonProperty("destination")})
    @lombok.Setter(onMethod_ = {@JsonProperty("destination")})
    private String destination;
}
