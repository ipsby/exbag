package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class CustomerLevel {
    @lombok.Getter(onMethod_ = {@JsonProperty("customerDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("customerDetails")})
    private CustomerDetails customerDetails;
    @lombok.Getter(onMethod_ = {@JsonProperty("uniqueCustomerId")})
    @lombok.Setter(onMethod_ = {@JsonProperty("uniqueCustomerId")})
    private UniqueCustomerID uniqueCustomerID;
    @lombok.Getter(onMethod_ = {@JsonProperty("sourceIndicator")})
    @lombok.Setter(onMethod_ = {@JsonProperty("sourceIndicator")})
    private SourceIndicator sourceIndicator;
    @lombok.Getter(onMethod_ = {@JsonProperty("recordLocator")})
    @lombok.Setter(onMethod_ = {@JsonProperty("recordLocator")})
    private RecordLocator recordLocator;
    @lombok.Getter(onMethod_ = {@JsonProperty("customerIndicators")})
    @lombok.Setter(onMethod_ = {@JsonProperty("customerIndicators")})
    private CustomerIndicators customerIndicators;
    @lombok.Getter(onMethod_ = {@JsonProperty("staffDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("staffDetails")})
    private StaffDetails staffDetails;
    @lombok.Getter(onMethod_ = {@JsonProperty("dummySegmentOne")})
    @lombok.Setter(onMethod_ = {@JsonProperty("dummySegmentOne")})
    private Object dummySegmentOne;
    @lombok.Getter(onMethod_ = {@JsonProperty("customerLevelServices")})
    @lombok.Setter(onMethod_ = {@JsonProperty("customerLevelServices")})
    private List<CustomerLevelService> customerLevelServices;
    @lombok.Getter(onMethod_ = {@JsonProperty("apnContactDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("apnContactDetails")})
    private List<ApnContactDetail> apnContactDetails;
    @lombok.Getter(onMethod_ = {@JsonProperty("productLevel")})
    @lombok.Setter(onMethod_ = {@JsonProperty("productLevel")})
    private List<ProductLevel> productLevel;
}
