package com.iman.exbag.entity;

import java.sql.Date;
import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "pax")
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class,
		  property = "id"
		)
public class Pax {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	private String paxName;
	private String paxNik;
	private Date departureDate;
	private String departureAirport;
	private String destinationAirport;
	private String flightNo;
	private String ticketNo;
	private String ticketType;
	private String gaMilesNo;
	private String gaMilesTier;
	private Integer freeBagAllow;
	private Integer totalBagWeight;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Timestamp deletedAt;
	
	// Many-to-one relationship with Booking
    @ManyToOne
    @JoinColumn(name = "booking_id", nullable = false)
    //@JsonBackReference
    private Booking booking;
}
