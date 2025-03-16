package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ContactDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("communication")})
    @lombok.Setter(onMethod_ = {@JsonProperty("communication")})
    private Communication communication;
}
