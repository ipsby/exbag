package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class Attributes {
    @lombok.Getter(onMethod_ = {@JsonProperty("TransactionStatusCode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("TransactionStatusCode")})
    private String transactionStatusCode;
}
