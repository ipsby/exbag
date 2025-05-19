package com.iman.exbag.service;

import java.util.List;
import java.util.stream.Collectors;

import com.iman.exbag.entity.Pax;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iman.exbag.entity.Booking;
import com.iman.exbag.repository.BookingRepository;

@Service
public class BookingService {
	@Autowired
    private BookingRepository bookingRepository;

    @PersistenceContext
    private EntityManager entityManager;
	
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

    public List<Booking> getBookingsByPnrCodeWithTruePaidStatusPaxes(String pnrCode) {
        // 1. Get all orders for customer with their items (single query)
        List<Booking> bookings = bookingRepository.findByPnrCode(pnrCode);

        // 2. Process in memory
        return bookings.stream()
                .peek(booking -> {
                    // Filter items within each order
                    List<Pax> paxes = booking.getPaxes().stream()
                            .filter(pax -> !pax.getStatusPayment())
                            .collect(Collectors.toList());
                    booking.setPaxes(paxes);
                })
                .filter(booking -> !booking.getPaxes().isEmpty()) // Remove orders with no discounted items
                .collect(Collectors.toList());
    }



}
