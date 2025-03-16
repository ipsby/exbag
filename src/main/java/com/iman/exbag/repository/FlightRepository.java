package com.iman.exbag.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.iman.exbag.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}

