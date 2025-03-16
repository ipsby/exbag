package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PurpleDocumentDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("number")})
    @lombok.Setter(onMethod_ = {@JsonProperty("number")})
    private String number;
}
