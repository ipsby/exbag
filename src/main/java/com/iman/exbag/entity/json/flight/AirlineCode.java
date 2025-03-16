package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class AirlineCode {
    @lombok.Getter(onMethod_ = {@JsonProperty("companyIdentification")})
    @lombok.Setter(onMethod_ = {@JsonProperty("companyIdentification")})
    private AirlineCodeCompanyIdentification companyIdentification;
}
