package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class AttributeDetail {
    @lombok.Getter(onMethod_ = {@JsonProperty("attributeType")})
    @lombok.Setter(onMethod_ = {@JsonProperty("attributeType")})
    private String attributeType;
    @lombok.Getter(onMethod_ = {@JsonProperty("attributeDescription")})
    @lombok.Setter(onMethod_ = {@JsonProperty("attributeDescription")})
    private String attributeDescription;
}
