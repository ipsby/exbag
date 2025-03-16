package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Header {
    @lombok.Getter(onMethod_ = {@JsonProperty("attributes")})
    @lombok.Setter(onMethod_ = {@JsonProperty("attributes")})
    private Attributes attributes;
    @lombok.Getter(onMethod_ = {@JsonProperty("SessionId")})
    @lombok.Setter(onMethod_ = {@JsonProperty("SessionId")})
    private String sessionID;
    @lombok.Getter(onMethod_ = {@JsonProperty("SequenceNumber")})
    @lombok.Setter(onMethod_ = {@JsonProperty("SequenceNumber")})
    private String sequenceNumber;
    @lombok.Getter(onMethod_ = {@JsonProperty("SecurityToken")})
    @lombok.Setter(onMethod_ = {@JsonProperty("SecurityToken")})
    private String securityToken;
}
