package com.iman.exbag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.iman.exbag.entity.Booking;
import com.iman.exbag.service.BookingService;

@RestController
@RequestMapping("/bookings")
public class BookingController {
	@Autowired
    private BookingService bookingService;
	
	@PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }

    @GetMapping("/{id}")
    public Booking getBookingById(@PathVariable Long id) {
        return bookingService.getBookingById(id);
    }
    
    @GetMapping("/pnr/{pnr_code}")
    public List<Booking> findBookingsByPnrCode(@PathVariable String pnr_code) {
        return bookingService.findBookingsByPnrCode(pnr_code);
    }
}
