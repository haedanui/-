package com.nhnacademy.resident.service.impl;

import com.nhnacademy.resident.model.HouseholdDto;
import com.nhnacademy.resident.repository.HouseholdRepository;
import com.nhnacademy.resident.service.HouseholdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HouseholdServiceImpl implements HouseholdService {
    private final HouseholdRepository householdRepository;

    public HouseholdServiceImpl(HouseholdRepository householdRepository) {
        this.householdRepository = householdRepository;
    }

    @Override
    public HouseholdDto findByNumber(Long number){
        return householdRepository.findByResident_ResidentSerialNumber(number);
    }
}
