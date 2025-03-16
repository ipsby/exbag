package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class AdditionalProductDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("departureStationInfo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("departureStationInfo")})
    private StationInfo departureStationInfo;
    @lombok.Getter(onMethod_ = {@JsonProperty("arrivalStationInfo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("arrivalStationInfo")})
    private StationInfo arrivalStationInfo;
}
