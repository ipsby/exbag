package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class BookedCabinCode {
    @lombok.Getter(onMethod_ = {@JsonProperty("cabinDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("cabinDetails")})
    private CabinDetails cabinDetails;
}
