package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class SelectionDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("option")})
    @lombok.Setter(onMethod_ = {@JsonProperty("option")})
    private String option;
}
