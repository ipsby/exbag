package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class ContactDetailsInfo {
    @lombok.Getter(onMethod_ = {@JsonProperty("statusInformation")})
    @lombok.Setter(onMethod_ = {@JsonProperty("statusInformation")})
    private List<ContactDetailsInfoStatusInformation> statusInformation;
}
