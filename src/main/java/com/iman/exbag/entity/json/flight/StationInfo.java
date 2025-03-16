package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class StationInfo {
    @lombok.Getter(onMethod_ = {@JsonProperty("terminal")})
    @lombok.Setter(onMethod_ = {@JsonProperty("terminal")})
    private String terminal;
}
