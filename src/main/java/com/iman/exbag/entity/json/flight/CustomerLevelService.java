package com.iman.exbag.entity.json.flight;

import com.fasterxml.jackson.annotation.*;
import java.util.List;

@lombok.Data
public class CustomerLevelService {
    @lombok.Getter(onMethod_ = {@JsonProperty("serviceDetails")})
    @lombok.Setter(onMethod_ = {@JsonProperty("serviceDetails")})
    private ServiceDetails serviceDetails;
    @lombok.Getter(onMethod_ = {@JsonProperty("serviceIdentifiers")})
    @lombok.Setter(onMethod_ = {@JsonProperty("serviceIdentifiers")})
    private List<UniqueCustomerID> serviceIdentifiers;
    @lombok.Getter(onMethod_ = {@JsonProperty("servicesCarrier")})
    @lombok.Setter(onMethod_ = {@JsonProperty("servicesCarrier")})
    private AirlineCode servicesCarrier;
}
