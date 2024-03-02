package com.nhnacademy.resident.service;

import com.nhnacademy.resident.model.ResidentDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ResidentService {

    Page<ResidentDto> getAllBy(Pageable pageable);

    ResidentDto findByName(String name);
}
