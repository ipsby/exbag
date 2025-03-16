package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class LegTime {
    @lombok.Getter(onMethod_ = {@JsonProperty("businessSemantic")})
    @lombok.Setter(onMethod_ = {@JsonProperty("businessSemantic")})
    private String businessSemantic;
    @lombok.Getter(onMethod_ = {@JsonProperty("timeMode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("timeMode")})
    private String timeMode;
    @lombok.Getter(onMethod_ = {@JsonProperty("dateTime")})
    @lombok.Setter(onMethod_ = {@JsonProperty("dateTime")})
    private DateTime dateTime;
}
