package com.nhnacademy.resident.service.impl;

import com.nhnacademy.resident.model.HouseholdCompositionResidentDto;
import com.nhnacademy.resident.repository.HouseholdCompositionResidentRepository;
import com.nhnacademy.resident.service.HouseholdCompositionResidentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HouseholdCompositionResidentServiceImpl implements HouseholdCompositionResidentService {
    private final HouseholdCompositionResidentRepository householdCompositionResidentRepository;

    @Autowired
    public HouseholdCompositionResidentServiceImpl(HouseholdCompositionResidentRepository householdCompositionResidentRepository) {
        this.householdCompositionResidentRepository = householdCompositionResidentRepository;
    }

    public List<HouseholdCompositionResidentDto> findByHouseholdHouseholdSerialNumber(Long householdNumber){
        return householdCompositionResidentRepository.findAllByPkHouseholdSerialNumber(householdNumber);
    }
}
