package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class SeatDetail {
    @lombok.Getter(onMethod_ = {@JsonProperty("seatNumber")})
    @lombok.Setter(onMethod_ = {@JsonProperty("seatNumber")})
    private String seatNumber;
    @lombok.Getter(onMethod_ = {@JsonProperty("seatCharacteristics")})
    @lombok.Setter(onMethod_ = {@JsonProperty("seatCharacteristics")})
    private List<String> seatCharacteristics;
}
