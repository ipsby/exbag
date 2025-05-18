package com.iman.exbag.dto;

import lombok.Data;

@Data
public class PaymentDetailsDTO {
    Double total_amount;
    String payment_method;
    String status;
}
