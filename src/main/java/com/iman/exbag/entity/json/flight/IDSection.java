package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class IDSection {
    @lombok.Getter(onMethod_ = {@JsonProperty("referenceQualifier")})
    @lombok.Setter(onMethod_ = {@JsonProperty("referenceQualifier")})
    private String referenceQualifier;
    @lombok.Getter(onMethod_ = {@JsonProperty("primeId")})
    @lombok.Setter(onMethod_ = {@JsonProperty("primeId")})
    private String primeID;
}
