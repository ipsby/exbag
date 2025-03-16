package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;
import java.time.OffsetDateTime;

@lombok.Data
public class FlightJSON {
    @lombok.Getter(onMethod_ = {@JsonProperty("responseCode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("responseCode")})
    private long responseCode;
    @lombok.Getter(onMethod_ = {@JsonProperty("header")})
    @lombok.Setter(onMethod_ = {@JsonProperty("header")})
    private Header header;
    @lombok.Getter(onMethod_ = {@JsonProperty("data")})
    @lombok.Setter(onMethod_ = {@JsonProperty("data")})
    private Data data;
    @lombok.Getter(onMethod_ = {@JsonProperty("timeStamp")})
    @lombok.Setter(onMethod_ = {@JsonProperty("timeStamp")})
    
    @JsonSetter(nulls = Nulls.SKIP)
    private OffsetDateTime timeStamp;
}
