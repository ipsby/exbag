package com.iman.exbag.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iman.exbag.entity.Booking;

public interface BookingRepository extends JpaRepository<Booking, Long> {
	List<Booking> findByPnrCode(String pnrCode);
}
