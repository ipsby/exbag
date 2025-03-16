package com.iman.exbag.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iman.exbag.service.ExternalApiService;

@RestController
@RequestMapping("/ext")
public class ApiController {

    @Autowired
    private ExternalApiService externalApiService;

    @GetMapping("/process-flight")
    public String processFlight(
    		@RequestParam(defaultValue = "1900-01-01") String bdate,
            @RequestParam(defaultValue = "1900-01-01") String edate,
            @RequestParam(defaultValue = "CGK") String oport,
            @RequestParam(defaultValue = "SUB") String dport
    		) {
        return externalApiService.processingFlight(bdate, edate, oport, dport);
    }
    
    @PostMapping("/process-booking")
    public String processBooking(
    		@RequestParam String flightNo, @RequestParam String depDate, @RequestParam String boardPoint
    		) {
    	return externalApiService.processingBooking(flightNo, depDate, boardPoint);
    }
}