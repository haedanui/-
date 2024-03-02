package com.nhnacademy.resident.repository;

import com.nhnacademy.resident.entity.HouseholdCompositionResident;
import com.nhnacademy.resident.model.HouseholdCompositionResidentDto;
import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface HouseholdCompositionResidentRepository extends JpaRepository<HouseholdCompositionResident, HouseholdCompositionResident.PK> {
    List<HouseholdCompositionResidentDto> findAllByPkHouseholdSerialNumber(Long householdSerialNumber);
}

