package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class HandlingSystem {
    @lombok.Getter(onMethod_ = {@JsonProperty("deliveringSystem")})
    @lombok.Setter(onMethod_ = {@JsonProperty("deliveringSystem")})
    private DeliveringSystem deliveringSystem;
}
