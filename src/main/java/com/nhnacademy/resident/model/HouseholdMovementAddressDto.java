package com.nhnacademy.resident.model;


import java.time.LocalDate;

public interface HouseholdMovementAddressDto {
//    LocalDate getHouseMovementReportDate();

    String getHouseMovementAddress();

    String getLastAddressYn();

    PK getPk();

    interface PK{
        LocalDate getHouseMovementReportDate();
    }
}
