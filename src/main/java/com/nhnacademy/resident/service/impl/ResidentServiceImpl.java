package com.nhnacademy.resident.service.impl;

import com.nhnacademy.resident.model.ResidentDto;
import com.nhnacademy.resident.repository.ResidentRepository;
import com.nhnacademy.resident.service.ResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResidentServiceImpl implements ResidentService {
    ResidentRepository residentRepository;

    @Autowired
    public ResidentServiceImpl(ResidentRepository residentRepository) {
        this.residentRepository = residentRepository;
    }

    @Override
    public Page<ResidentDto> getAllBy(Pageable pageable){
        return residentRepository.findAllBy(pageable);
    }

    @Override
    public ResidentDto findByName(String name){
        return residentRepository.findByName(name);
    }

}
