package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ServiceDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("specialRequirementsInfo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("specialRequirementsInfo")})
    private ServiceDetailsSpecialRequirementsInfo specialRequirementsInfo;
}
