package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class OtherPaxDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("givenName")})
    @lombok.Setter(onMethod_ = {@JsonProperty("givenName")})
    private String givenName;
}
