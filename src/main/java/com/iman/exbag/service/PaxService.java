package com.iman.exbag.service;

import com.iman.exbag.entity.Booking;
import com.iman.exbag.entity.Pax;
import com.iman.exbag.repository.BookingRepository;
import com.iman.exbag.repository.PaxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.iman.exbag.exception.EntityNotFoundException;

@Service
public class PaxService {
    @Autowired
    private PaxRepository paxRepository;

    @Autowired
    private BookingRepository bookingRepository;

    public Pax createPax(Pax pax) {
        return paxRepository.save(pax);
    }

    public Pax updatePax(Long paxId, Pax updatedItem) {
        return paxRepository.findById(paxId)
                .map(existingItem -> {
                    // Update only the fields that should be modifiable
                    if (updatedItem.getPaxEmail() != null) {
                        existingItem.setPaxEmail(updatedItem.getPaxEmail());
                    }
                    if (updatedItem.getPaxPhone() != null) {
                        existingItem.setPaxPhone(updatedItem.getPaxPhone());
                    }
                    if (updatedItem.getKtpNik() != null) {
                        existingItem.setKtpNik(updatedItem.getKtpNik());
                    }
                    if (updatedItem.getKtpNama() != null) {
                        existingItem.setKtpNama(updatedItem.getKtpNama());
                    }
                    if (updatedItem.getKtpTptLahir() != null) {
                        existingItem.setKtpTptLahir(updatedItem.getKtpTptLahir());
                    }
                    if (updatedItem.getKtpTglLahir() != null) {
                        existingItem.setKtpTglLahir(updatedItem.getKtpTglLahir());
                    }
                    if (updatedItem.getKtpKelamin() != null) {
                        existingItem.setKtpKelamin(updatedItem.getKtpKelamin());
                    }
                    if (updatedItem.getKtpGolDarah() != null) {
                        existingItem.setKtpGolDarah(updatedItem.getKtpGolDarah());
                    }
                    if (updatedItem.getKtpAlamat() != null) {
                        existingItem.setKtpAlamat(updatedItem.getKtpAlamat());
                    }
                    if (updatedItem.getKtpRt() != null) {
                        existingItem.setKtpRt(updatedItem.getKtpRt());
                    }
                    if (updatedItem.getKtpRw() != null) {
                        existingItem.setKtpRw(updatedItem.getKtpRw());
                    }
                    if (updatedItem.getKtpDesa() != null) {
                        existingItem.setKtpDesa(updatedItem.getKtpDesa());
                    }
                    if (updatedItem.getKtpKecamatan() != null) {
                        existingItem.setKtpKecamatan(updatedItem.getKtpKecamatan());
                    }
                    if (updatedItem.getKtpPekerjaan() != null) {
                        existingItem.setKtpPekerjaan(updatedItem.getKtpPekerjaan());
                    }
                    if (updatedItem.getKtpCitizenship() != null) {
                        existingItem.setKtpCitizenship(updatedItem.getKtpCitizenship());
                    }
                    return paxRepository.save(existingItem);
                })
                .orElseThrow(() -> new EntityNotFoundException(Pax.class, "id", paxId.toString()));
    }

    public Pax updatePaxForBooking(Long bookingId, Long paxId, Pax updatedItem) {
        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(() -> new EntityNotFoundException(Booking.class, "id", bookingId.toString()));

        return booking.getPaxes().stream()
                .filter(item -> item.getId().equals(paxId))
                .findFirst()
                .map(item -> {
                    item.setPaxEmail(updatedItem.getPaxEmail());
                    item.setPaxPhone(updatedItem.getPaxPhone());
                    item.setKtpNik(updatedItem.getKtpNik());
                    item.setKtpNama(updatedItem.getKtpNama());
                    item.setKtpTptLahir(updatedItem.getKtpTptLahir());
                    item.setKtpTglLahir(updatedItem.getKtpTglLahir());
                    item.setKtpKelamin(updatedItem.getKtpKelamin());
                    item.setKtpGolDarah(updatedItem.getKtpGolDarah());
                    item.setKtpAlamat(updatedItem.getKtpAlamat());
                    item.setKtpRt(updatedItem.getKtpRt());
                    item.setKtpRw(updatedItem.getKtpRw());
                    item.setKtpDesa(updatedItem.getKtpDesa());
                    item.setKtpKecamatan(updatedItem.getKtpKecamatan());
                    item.setKtpPekerjaan(updatedItem.getKtpPekerjaan());
                    item.setKtpCitizenship(updatedItem.getKtpCitizenship());
                    return paxRepository.save(item);
                })
                .orElseThrow(() -> new EntityNotFoundException(Pax.class, "id", paxId.toString()));
    }
}
