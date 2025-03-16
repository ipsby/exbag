package com.iman.exbag.entity;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "booking")
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class,
		  property = "id"
		)
public class Booking {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String pnrCode;
	private String flightCode;
	private Date flightDate;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	private Timestamp deletedAt;

	// One-to-many relationship with Pax
	@OneToMany(mappedBy = "booking", cascade = CascadeType.ALL, orphanRemoval = true)
	//@JsonManagedReference
	private List<Pax> paxes;
}
