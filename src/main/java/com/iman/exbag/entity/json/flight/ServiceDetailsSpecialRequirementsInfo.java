package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class ServiceDetailsSpecialRequirementsInfo {
    @lombok.Getter(onMethod_ = {@JsonProperty("ssrCode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("ssrCode")})
    private String ssrCode;
    @lombok.Getter(onMethod_ = {@JsonProperty("actionCode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("actionCode")})
    private String actionCode;
    @lombok.Getter(onMethod_ = {@JsonProperty("numberInParty")})
    @lombok.Setter(onMethod_ = {@JsonProperty("numberInParty")})
    private String numberInParty;
    @lombok.Getter(onMethod_ = {@JsonProperty("serviceType")})
    @lombok.Setter(onMethod_ = {@JsonProperty("serviceType")})
    private String serviceType;
    @lombok.Getter(onMethod_ = {@JsonProperty("serviceFreeText")})
    @lombok.Setter(onMethod_ = {@JsonProperty("serviceFreeText")})
    private String serviceFreeText;
}
