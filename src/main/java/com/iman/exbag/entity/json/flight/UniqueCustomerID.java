package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class UniqueCustomerID {
    @lombok.Getter(onMethod_ = {@JsonProperty("idSection")})
    @lombok.Setter(onMethod_ = {@JsonProperty("idSection")})
    private IDSection idSection;
}
