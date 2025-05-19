package com.iman.exbag.dto;

import lombok.Data;

@Data
public class PaymentDetailsDTO {
    String total_amount;
    String total_waive_weight;
    String total_waive_amount;
    String payment_method;
    String status;
}
