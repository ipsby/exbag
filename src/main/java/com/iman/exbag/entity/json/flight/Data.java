package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class Data {
    @lombok.Getter(onMethod_ = {@JsonProperty("customerLevel")})
    @lombok.Setter(onMethod_ = {@JsonProperty("customerLevel")})
    private List<CustomerLevel> customerLevel;
}
