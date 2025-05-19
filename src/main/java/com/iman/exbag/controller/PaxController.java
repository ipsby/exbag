package com.iman.exbag.controller;

import com.iman.exbag.entity.Pax;
import com.iman.exbag.service.PaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pax")
public class PaxController {
    @Autowired
    private PaxService paxService;

    @PostMapping
    public Pax createPax(@RequestBody Pax pax) {
        return paxService.createPax(pax);
    }

    // Update a specific pax
    @PutMapping("/{bookingId}/{paxId}")
    public ResponseEntity<Pax> updatePax(
            @PathVariable Long bookingId,
            @PathVariable Long paxId,
            @RequestBody Pax updatedItem) {
        Pax pax = paxService.updatePaxForBooking(bookingId, paxId, updatedItem);
        return ResponseEntity.ok(pax);
    }

    @PutMapping
    public ResponseEntity<Pax> updatePaxDirectly(
            @RequestBody Pax updatedItem) {
        Pax pax = paxService.updatePax(updatedItem.getId(), updatedItem);
        return ResponseEntity.ok(pax);
    }
}
