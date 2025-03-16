package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class PaymentPendingInd {
    @lombok.Getter(onMethod_ = {@JsonProperty("statusInformation")})
    @lombok.Setter(onMethod_ = {@JsonProperty("statusInformation")})
    private CustomerIndicatorsStatusInformation statusInformation;
}
