package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class CustomerIndicatorsStatusInformation {
    @lombok.Getter(onMethod_ = {@JsonProperty("indicator")})
    @lombok.Setter(onMethod_ = {@JsonProperty("indicator")})
    private String indicator;
    @lombok.Getter(onMethod_ = {@JsonProperty("action")})
    @lombok.Setter(onMethod_ = {@JsonProperty("action")})
    private String action;
}
