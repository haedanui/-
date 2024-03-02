package com.nhnacademy.resident.repository;

import com.nhnacademy.resident.entity.HouseholdMovementAddress;
import com.nhnacademy.resident.model.HouseholdMovementAddressDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HouseholdMovementAddressRepository extends JpaRepository<HouseholdMovementAddress, HouseholdMovementAddress.PK> {
    @Query("select h from HouseholdMovementAddress h where h.household.householdSerialNumber = :residentSerialNumber order by h.pk.houseMovementReportDate DESC")
    List<HouseholdMovementAddressDto> findAllByPkHouseholdSerialNumber(@Param("residentSerialNumber") Long householdNumber);

//    List<HouseholdMovementAddressDto> findAllByHousehold_HouseholdSerialNumber(Long householdNumber);
}
