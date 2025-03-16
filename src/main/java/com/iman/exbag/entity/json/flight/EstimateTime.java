package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class EstimateTime {
    @lombok.Getter(onMethod_ = {@JsonProperty("businessSemantic")})
    @lombok.Setter(onMethod_ = {@JsonProperty("businessSemantic")})
    private String businessSemantic;
}
