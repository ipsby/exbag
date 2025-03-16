package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class ProductLevelIndicators {
    @lombok.Getter(onMethod_ = {@JsonProperty("attributeDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("attributeDetails")})
    private List<AttributeDetail> attributeDetails;
}
