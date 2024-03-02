package com.nhnacademy.resident.service;

import com.nhnacademy.resident.model.HouseholdMovementAddressDto;

import java.util.List;

public interface HouseholdMovementAddressService {

    List<HouseholdMovementAddressDto> findByHouseholdSerialNumber(Long number);
}
