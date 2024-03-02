package com.nhnacademy.resident.service;

import com.nhnacademy.resident.model.HouseholdCompositionResidentDto;

import java.util.List;

public interface HouseholdCompositionResidentService {
    List<HouseholdCompositionResidentDto> findByHouseholdHouseholdSerialNumber(Long householdNumber);
}
