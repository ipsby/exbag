package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class RecordLocator {
    @lombok.Getter(onMethod_ = {@JsonProperty("reservation")})
    @lombok.Setter(onMethod_ = {@JsonProperty("reservation")})
    private RecordLocatorReservation reservation;
}
