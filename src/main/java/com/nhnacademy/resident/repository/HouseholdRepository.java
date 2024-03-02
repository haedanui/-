package com.nhnacademy.resident.repository;

import com.nhnacademy.resident.entity.Household;
import com.nhnacademy.resident.model.HouseholdDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface HouseholdRepository extends JpaRepository<Household, Long> {

//    @Query("select h from Household h where h.resident.residentSerialNumber = :residentSerialNumber")
//    HouseholdDto findBySerialNumber(@Param("residentSerialNumber") Long number);
    HouseholdDto findByResident_ResidentSerialNumber(Long residentNumber);
}
