package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class TicketTicketDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("documentDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("documentDetails")})
    private TicketInfoDocumentDetails documentDetails;
    @lombok.Getter(onMethod_ = {@JsonProperty("status")})
    @lombok.Setter(onMethod_ = {@JsonProperty("status")})
    private String status;
}
