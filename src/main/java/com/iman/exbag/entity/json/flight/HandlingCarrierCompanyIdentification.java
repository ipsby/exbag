package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class HandlingCarrierCompanyIdentification {
    @lombok.Getter(onMethod_ = {@JsonProperty("otherCompany")})
    @lombok.Setter(onMethod_ = {@JsonProperty("otherCompany")})
    private String otherCompany;
}
