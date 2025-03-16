package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class LegLevel {
    @lombok.Getter(onMethod_ = {@JsonProperty("legRouting")})
    @lombok.Setter(onMethod_ = {@JsonProperty("legRouting")})
    private LegRouting legRouting;
    @lombok.Getter(onMethod_ = {@JsonProperty("legLevelDumTXFSeg")})
    @lombok.Setter(onMethod_ = {@JsonProperty("legLevelDumTXFSeg")})
    private Object legLevelDumTXFSeg;
    @lombok.Getter(onMethod_ = {@JsonProperty("additionalProductDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("additionalProductDetails")})
    private AdditionalProductDetails additionalProductDetails;
    @lombok.Getter(onMethod_ = {@JsonProperty("securityNumber")})
    @lombok.Setter(onMethod_ = {@JsonProperty("securityNumber")})
    private List<SecurityNumber> securityNumber;
    @lombok.Getter(onMethod_ = {@JsonProperty("seatInfo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("seatInfo")})
    private List<SeatInfo> seatInfo;
    @lombok.Getter(onMethod_ = {@JsonProperty("legLevelIndicator")})
    @lombok.Setter(onMethod_ = {@JsonProperty("legLevelIndicator")})
    private CustomerIndicators legLevelIndicator;
    @lombok.Getter(onMethod_ = {@JsonProperty("legTimes")})
    @lombok.Setter(onMethod_ = {@JsonProperty("legTimes")})
    private List<LegTime> legTimes;
    @lombok.Getter(onMethod_ = {@JsonProperty("legSeparator")})
    @lombok.Setter(onMethod_ = {@JsonProperty("legSeparator")})
    private Object legSeparator;
    @lombok.Getter(onMethod_ = {@JsonProperty("legSeparator2")})
    @lombok.Setter(onMethod_ = {@JsonProperty("legSeparator2")})
    private Object legSeparator2;
    @lombok.Getter(onMethod_ = {@JsonProperty("flightLegStatuses")})
    @lombok.Setter(onMethod_ = {@JsonProperty("flightLegStatuses")})
    private CustomerIndicators flightLegStatuses;
}
