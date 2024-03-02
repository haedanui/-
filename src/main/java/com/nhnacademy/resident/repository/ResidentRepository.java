package com.nhnacademy.resident.repository;

import com.nhnacademy.resident.entity.Resident;
import com.nhnacademy.resident.model.ResidentDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ResidentRepository extends JpaRepository<Resident, Long> {

    Page<ResidentDto> findAllBy(Pageable pageable);
    ResidentDto findByName(String name);

}
