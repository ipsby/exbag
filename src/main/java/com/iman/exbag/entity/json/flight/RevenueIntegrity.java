package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class RevenueIntegrity {
    @lombok.Getter(onMethod_ = {@JsonProperty("revIntegIndicators")})
    @lombok.Setter(onMethod_ = {@JsonProperty("revIntegIndicators")})
    private CustomerIndicators revIntegIndicators;
}
