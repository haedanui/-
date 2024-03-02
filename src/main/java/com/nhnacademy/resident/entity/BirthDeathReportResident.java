package com.nhnacademy.resident.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Table(name = "birth_death_report_resident")
@Getter
@Setter
@NoArgsConstructor
public class BirthDeathReportResident {

    @EmbeddedId
    private PK pk;

    @Column(name = "birth_death_report_date")
    private LocalDateTime birthDeathReportDate;

    @Column(name = "birth_report_qualifications_code")
    private String birthReportQualificationsCode;

    @Column(name = "death_report_qualifications_code")
    private String deathReportQualificationsCode;

    @Column(name = "email_address")
    private String emailAddress;

    @Column(name = "phone_number")
    private String phoneNumber;

    @MapsId("residentSerialNumber")
    @ManyToOne
    @JoinColumn(name = "resident_serial_number")
    private Resident resident;

    @Getter
    @Setter
    @NoArgsConstructor
    @AllArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public static class PK implements Serializable {
        @Column(name = "birth_date_type_code")
        private String birthDeathTypeCode;

        @Column(name = "report_resident_serial_number")
        private Long reportResidentSerialNumber;

        @Column(name = "resident_serial_number")
        private Long residentSerialNumber;
    }
}
