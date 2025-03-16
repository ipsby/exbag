package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class SeatInfoSpecialRequirementsInfo {
    @lombok.Getter(onMethod_ = {@JsonProperty("otherServiceType")})
    @lombok.Setter(onMethod_ = {@JsonProperty("otherServiceType")})
    private String otherServiceType;
}
