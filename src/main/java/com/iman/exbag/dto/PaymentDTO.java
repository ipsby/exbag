package com.iman.exbag.dto;
import lombok.Data;

import java.util.List;

@Data
public class PaymentDTO {
    String transaction_id;
    String timestamp;
    Long total_passengers;

    List<PassengerDTO> passengers;
    PaymentDetailsDTO payment_details;
}
