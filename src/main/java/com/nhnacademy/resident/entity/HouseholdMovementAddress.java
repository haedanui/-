package com.nhnacademy.resident.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "household_movement_address")
@Getter
@Setter
@NoArgsConstructor
public class HouseholdMovementAddress {
    @EmbeddedId
    private PK pk;

    @Column(name = "house_movement_address")
    private String houseMovementAddress;

    @Column(name = "last_address_yn")
    private String lastAddressYn;

    @MapsId("householdSerialNumber")
    @ManyToOne
    @JoinColumn(name = "household_serial_number")
    private Household household;


    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class PK implements Serializable {
        @Column(name = "house_movement_report_date")
        private LocalDate houseMovementReportDate;

        @Column(name = "household_serial_number")
        private Long householdSerialNumber;
    }
}
