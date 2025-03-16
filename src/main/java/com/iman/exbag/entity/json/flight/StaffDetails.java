package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class StaffDetails {
    @lombok.Getter(onMethod_ = {@JsonProperty("staffInfo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("staffInfo")})
    private Object staffInfo;
    @lombok.Getter(onMethod_ = {@JsonProperty("staffCategoryInfo")})
    @lombok.Setter(onMethod_ = {@JsonProperty("staffCategoryInfo")})
    private StaffCategoryInfo staffCategoryInfo;
}
