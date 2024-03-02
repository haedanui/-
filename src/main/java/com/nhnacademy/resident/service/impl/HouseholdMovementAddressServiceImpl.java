package com.nhnacademy.resident.service.impl;

import com.nhnacademy.resident.model.HouseholdMovementAddressDto;
import com.nhnacademy.resident.repository.HouseholdMovementAddressRepository;
import com.nhnacademy.resident.service.HouseholdMovementAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseholdMovementAddressServiceImpl implements HouseholdMovementAddressService {
    private final HouseholdMovementAddressRepository householdMovementAddressRepository;

    @Autowired
    public HouseholdMovementAddressServiceImpl(HouseholdMovementAddressRepository householdMovementAddressRepository) {
        this.householdMovementAddressRepository = householdMovementAddressRepository;
    }

    public List<HouseholdMovementAddressDto> findByHouseholdSerialNumber(Long householdNumber){
        return householdMovementAddressRepository.findAllByPkHouseholdSerialNumber(householdNumber);
    }
}
