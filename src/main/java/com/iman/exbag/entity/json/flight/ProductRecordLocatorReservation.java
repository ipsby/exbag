package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ProductRecordLocatorReservation {
    @lombok.Getter(onMethod_ = {@JsonProperty("companyId")})
    @lombok.Setter(onMethod_ = {@JsonProperty("companyId")})
    private String companyID;
    @lombok.Getter(onMethod_ = {@JsonProperty("controlNumber")})
    @lombok.Setter(onMethod_ = {@JsonProperty("controlNumber")})
    private String controlNumber;
    @lombok.Getter(onMethod_ = {@JsonProperty("controlType")})
    @lombok.Setter(onMethod_ = {@JsonProperty("controlType")})
    private String controlType;
}
