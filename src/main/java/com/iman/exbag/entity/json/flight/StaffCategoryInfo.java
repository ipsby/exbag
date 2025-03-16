package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class StaffCategoryInfo {
    @lombok.Getter(onMethod_ = {@JsonProperty("attributeDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("attributeDetails")})
    private AttributeDetails attributeDetails;
}
