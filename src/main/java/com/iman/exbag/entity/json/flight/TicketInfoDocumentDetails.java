package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class TicketInfoDocumentDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("number")})
    @lombok.Setter(onMethod_ = {@JsonProperty("number")})
    private String number;
    @lombok.Getter(onMethod_ = {@JsonProperty("type")})
    @lombok.Setter(onMethod_ = {@JsonProperty("type")})
    private String type;
}
