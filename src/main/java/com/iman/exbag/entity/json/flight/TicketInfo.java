package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class TicketInfo {
    @lombok.Getter(onMethod_ = {@JsonProperty("documentDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("documentDetails")})
    private TicketInfoDocumentDetails documentDetails;
}
