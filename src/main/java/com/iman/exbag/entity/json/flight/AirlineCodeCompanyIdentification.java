package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class AirlineCodeCompanyIdentification {
    @lombok.Getter(onMethod_ = {@JsonProperty("marketingCompany")})
    @lombok.Setter(onMethod_ = {@JsonProperty("marketingCompany")})
    private String marketingCompany;
}
