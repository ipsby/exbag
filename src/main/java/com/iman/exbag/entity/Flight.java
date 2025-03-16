package com.iman.exbag.entity;
import java.sql.Date;
import java.sql.Timestamp;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Flight {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String flightNo;
	private String operatingCarrier;
	private String boardPoint;
	private String offPoint;
	private Date departureDate;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Timestamp deletedAt;
}
