package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class SecurityNumber {
    @lombok.Getter(onMethod_ = {@JsonProperty("referenceDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("referenceDetails")})
    private ReferenceDetails referenceDetails;
}
