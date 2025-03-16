package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;

@lombok.Data
public class SourceIndicator {
    @lombok.Getter(onMethod_ = {@JsonProperty("selectionDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("selectionDetails")})
    private SelectionDetails selectionDetails;
}
