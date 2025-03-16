package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CabinDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("classDesignator")})
    @lombok.Setter(onMethod_ = {@JsonProperty("classDesignator")})
    private String classDesignator;
    @lombok.Getter(onMethod_ = {@JsonProperty("bookingClass")})
    @lombok.Setter(onMethod_ = {@JsonProperty("bookingClass")})
    private String bookingClass;
}
