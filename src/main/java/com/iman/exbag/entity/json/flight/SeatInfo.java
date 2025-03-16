package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class SeatInfo {
    @lombok.Getter(onMethod_ = {@JsonProperty("specialRequirementsInfo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("specialRequirementsInfo")})
    private SeatInfoSpecialRequirementsInfo specialRequirementsInfo;
    @lombok.Getter(onMethod_ = {@JsonProperty("seatDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("seatDetails")})
    private List<SeatDetail> seatDetails;
}
