package com.iman.exbag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iman.exbag.entity.Booking;
import com.iman.exbag.repository.BookingRepository;

@Service
public class BookingService {
	@Autowired
    private BookingRepository bookingRepository;
	
	public Booking createBooking(Booking booking) {
		return bookingRepository.save(booking);
	}
	
	public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }
	
	public List<Booking> getBookingsByPnrCode(String pnrCode) {
        return bookingRepository.findByPnrCode(pnrCode);
    }

    public Booking getBookingById(Long id) {
        return bookingRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Order not found"));
    }
    
    public List<Booking> findBookingsByPnrCode(String pnrCode) {
        return bookingRepository.findByPnrCode(pnrCode);
    }
}
