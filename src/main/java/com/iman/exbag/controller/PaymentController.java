package com.iman.exbag.controller;

import com.iman.exbag.dto.PaymentDTO;
import com.iman.exbag.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public String createPayment(@RequestBody PaymentDTO payment) {
        return paymentService.insertPayment(payment);
    }
}
