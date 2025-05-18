package com.iman.exbag.service;

import com.iman.exbag.dto.PassengerDTO;
import com.iman.exbag.dto.PaymentDTO;
import com.iman.exbag.entity.Pax;
import com.iman.exbag.entity.Payment;
import com.iman.exbag.repository.PaxRepository;
import com.iman.exbag.repository.PaymentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PaymentService {
    @Autowired
    private PaxRepository paxRepository;

    @Autowired
    private PaymentRepository paymentRepository;

    public String insertPayment(PaymentDTO paymentRaw) {
        Payment newPay = new Payment();
        newPay.setTransId(paymentRaw.getTransaction_id());
        newPay.setTotalPax(paymentRaw.getTotal_passengers());
        newPay.setTotalAmount(paymentRaw.getPaymentDetails().getTotal_amount());
        newPay.setPaymentMethod(paymentRaw.getPaymentDetails().getPayment_method());
        newPay.setStatus(paymentRaw.getPaymentDetails().getStatus());
        Payment payment = paymentRepository.save(newPay);

        if (payment != null) {
            List<Pax> paxes = new ArrayList<Pax>();
            for (PassengerDTO passenger: paymentRaw.getPassengers()) {
                Optional<Pax> pax = paxRepository.findById(passenger.getPax_id());
                pax.get().setPaymentId(payment.getId());
                pax.get().setStatusPayment(true);
                paxes.add(pax.get());
            }
            paxRepository.saveAll(paxes);
        }
        return payment.getId().toString();
    }
}
