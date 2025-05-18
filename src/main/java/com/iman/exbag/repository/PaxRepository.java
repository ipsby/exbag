package com.iman.exbag.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.iman.exbag.entity.Pax;
import java.util.List;

public interface PaxRepository extends JpaRepository<Pax, Long> {
    // Find all paxes by theid IDs
    List<Pax> findAllByIdIn(List<Long> ids);

}
