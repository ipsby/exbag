package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class FlightDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("flightNumber")})
    @lombok.Setter(onMethod_ = {@JsonProperty("flightNumber")})
    private String flightNumber;
}
