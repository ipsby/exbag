package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class DeliveringSystem {
    @lombok.Getter(onMethod_ = {@JsonProperty("companyId")})
    @lombok.Setter(onMethod_ = {@JsonProperty("companyId")})
    private String companyID;
}
