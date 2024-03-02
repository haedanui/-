package com.nhnacademy.resident.service;

import com.nhnacademy.resident.model.HouseholdDto;

public interface HouseholdService {
    HouseholdDto findByNumber(Long number);
}
