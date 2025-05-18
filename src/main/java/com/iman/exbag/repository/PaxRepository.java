package com.iman.exbag.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iman.exbag.entity.Pax;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PaxRepository extends JpaRepository<Pax, Long> {
    // Find all paxes by theid IDs
    List<Pax> findAllByIdIn(List<Long> ids);

    // Bulk update statusPayment, paymentId for specific paxes
    @Modifying
    @Query("UPDATE Pax p SET p.statusPayment = 1, p.paymentId = :paymentId WHERE p.id IN :ids")
    int bulkUpdatePrice(@Param("ids") List<Long> ids, @Param("paymentId") Long paymentId);
}
