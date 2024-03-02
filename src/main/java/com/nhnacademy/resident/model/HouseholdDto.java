package com.nhnacademy.resident.model;


import java.time.LocalDate;

public interface HouseholdDto {
    Long getHouseholdSerialNumber();
    LocalDate getHouseholdCompositionDate();
    String getHouseholdCompositionReasonCode();
}
