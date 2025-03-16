package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class OperatingFlightDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("carrierDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("carrierDetails")})
    private CarrierDetails carrierDetails;
    @lombok.Getter(onMethod_ = {@JsonProperty("flightDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("flightDetails")})
    private FlightDetails flightDetails;
    @lombok.Getter(onMethod_ = {@JsonProperty("departureDate")})
    @lombok.Setter(onMethod_ = {@JsonProperty("departureDate")})
    private String departureDate;
    @lombok.Getter(onMethod_ = {@JsonProperty("boardPoint")})
    @lombok.Setter(onMethod_ = {@JsonProperty("boardPoint")})
    private String boardPoint;
    @lombok.Getter(onMethod_ = {@JsonProperty("offPoint")})
    @lombok.Setter(onMethod_ = {@JsonProperty("offPoint")})
    private String offPoint;
}
