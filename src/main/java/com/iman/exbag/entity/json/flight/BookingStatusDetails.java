package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BookingStatusDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("statusCode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("statusCode")})
    private String statusCode;
}
