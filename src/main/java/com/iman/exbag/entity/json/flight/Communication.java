package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Communication {
    @lombok.Getter(onMethod_ = {@JsonProperty("urlAddress")})
    @lombok.Setter(onMethod_ = {@JsonProperty("urlAddress")})
    private String urlAddress;
    @lombok.Getter(onMethod_ = {@JsonProperty("urlType")})
    @lombok.Setter(onMethod_ = {@JsonProperty("urlType")})
    private String urlType;
}
