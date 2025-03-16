package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class DateTime {
    @lombok.Getter(onMethod_ = {@JsonProperty("year")})
    @lombok.Setter(onMethod_ = {@JsonProperty("year")})
    private String year;
    @lombok.Getter(onMethod_ = {@JsonProperty("month")})
    @lombok.Setter(onMethod_ = {@JsonProperty("month")})
    private String month;
    @lombok.Getter(onMethod_ = {@JsonProperty("day")})
    @lombok.Setter(onMethod_ = {@JsonProperty("day")})
    private String day;
    @lombok.Getter(onMethod_ = {@JsonProperty("hour")})
    @lombok.Setter(onMethod_ = {@JsonProperty("hour")})
    private String hour;
    @lombok.Getter(onMethod_ = {@JsonProperty("minutes")})
    @lombok.Setter(onMethod_ = {@JsonProperty("minutes")})
    private String minutes;
    @lombok.Getter(onMethod_ = {@JsonProperty("seconds")})
    @lombok.Setter(onMethod_ = {@JsonProperty("seconds")})
    private String seconds;
}
