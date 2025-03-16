package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class DisruptionInfo {
    @lombok.Getter(onMethod_ = {@JsonProperty("disruptionStatus")})
    @lombok.Setter(onMethod_ = {@JsonProperty("disruptionStatus")})
    private ProductLevelIndicators disruptionStatus;
}
