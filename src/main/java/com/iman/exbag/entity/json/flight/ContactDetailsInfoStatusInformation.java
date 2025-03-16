package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ContactDetailsInfoStatusInformation {
    @lombok.Getter(onMethod_ = {@JsonProperty("type")})
    @lombok.Setter(onMethod_ = {@JsonProperty("type")})
    private String type;
    @lombok.Getter(onMethod_ = {@JsonProperty("description")})
    @lombok.Setter(onMethod_ = {@JsonProperty("description")})
    private String description;
}
