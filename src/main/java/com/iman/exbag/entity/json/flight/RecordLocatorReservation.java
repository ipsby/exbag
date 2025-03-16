package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class RecordLocatorReservation {
    @lombok.Getter(onMethod_ = {@JsonProperty("companyId")})
    @lombok.Setter(onMethod_ = {@JsonProperty("companyId")})
    private String companyID;
    @lombok.Getter(onMethod_ = {@JsonProperty("controlNumber")})
    @lombok.Setter(onMethod_ = {@JsonProperty("controlNumber")})
    private String controlNumber;
}
