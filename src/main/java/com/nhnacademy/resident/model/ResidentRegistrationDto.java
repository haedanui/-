//package com.nhnacademy.resident.model;
//
//
//import java.time.LocalDateTime;
//import java.util.List;
//
//public interface ResidentRegistrationDto {
//
//    Long getResidentSerialNumber();
//
//    String getName();
//
//    String getResidentRegistrationNumber();
//
//    List<HouseholdDto> getHouseholds();
//
//    List<HouseholdCompositionResidentDto> getFamilyRelationships();
//
//    List<CertificateIssueDto> getCertificateIssues();
//
//    interface HouseholdDto {
//        String getHouseholdCompositionReasonCode();
//
//        LocalDateTime getHouseholdCompositionDate();
//
//        List<HouseholdMovementAddressDto> getHouseholdMovementAddresses();
//    }
//    interface HouseholdMovementAddressDto {
//        LocalDateTime getHouseMovementReportDate();
//
//        String getHouseMovementAddress();
//    }
//
//
//    interface HouseholdCompositionResidentDto {
//        LocalDateTime getReportDate();
//
//        String getHouseholdRelationshipCode();
//
//        String getHouseholdCompositionChangeReasonCode();
//    }
//
//    interface CertificateIssueDto {
//
//        String getCertificateTypeCode();
//
//        LocalDateTime getCertificateIssueDate();
//    }
//
//
//}
