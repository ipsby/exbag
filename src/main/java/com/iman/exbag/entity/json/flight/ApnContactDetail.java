package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ApnContactDetail {
    @lombok.Getter(onMethod_ = {@JsonProperty("airlineCode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("airlineCode")})
    private AirlineCode airlineCode;
    @lombok.Getter(onMethod_ = {@JsonProperty("contactDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("contactDetails")})
    private ContactDetails contactDetails;
    @lombok.Getter(onMethod_ = {@JsonProperty("contactDetailsInfo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("contactDetailsInfo")})
    private ContactDetailsInfo contactDetailsInfo;
}
