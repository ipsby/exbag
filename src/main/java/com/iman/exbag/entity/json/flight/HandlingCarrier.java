package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class HandlingCarrier {
    @lombok.Getter(onMethod_ = {@JsonProperty("companyIdentification")})
    @lombok.Setter(onMethod_ = {@JsonProperty("companyIdentification")})
    private HandlingCarrierCompanyIdentification companyIdentification;
}
