package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class AttributeDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("attributeType")})
    @lombok.Setter(onMethod_ = {@JsonProperty("attributeType")})
    private String attributeType;
}
