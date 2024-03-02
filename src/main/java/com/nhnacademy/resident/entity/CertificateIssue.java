package com.nhnacademy.resident.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "certificate_issue")
@Getter
@Setter
@NoArgsConstructor
public class CertificateIssue {
    @Id
    @Column(name = "certificate_confirmation_number")
    private Long certificateConfirmationNumber;

    @Column(name = "certificate_type_code")
    private String certificateTypeCode;

    @Column(name = "certificate_issue_date")
    private LocalDate certificateIssueDate;

    @ManyToOne
    @JoinColumn(name = "resident_serial_number")
    Resident resident;
}
