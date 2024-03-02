package com.nhnacademy.resident.model;

import java.time.LocalDate;

public interface HouseholdCompositionResidentDto {
    LocalDate getReportDate();
    String getHouseholdRelationshipCode();
    String getHouseholdCompositionChangeReasonCode();

    ResidentNameAndRegistrationNumberDto getResident();
    HouseholdSerialNumberDto getHousehold();

    interface ResidentNameAndRegistrationNumberDto {
        String getName();
        String getResidentRegistrationNumber();
    }

    interface HouseholdSerialNumberDto {
        String getHouseholdSerialNumber();
    }
}
