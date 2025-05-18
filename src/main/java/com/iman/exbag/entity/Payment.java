package com.iman.exbag.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "payment")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String transId;
    private Long totalPax;
    private Double totalAmount;
    private String paymentMethod;
    private String status;

    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Timestamp deletedAt;
}
