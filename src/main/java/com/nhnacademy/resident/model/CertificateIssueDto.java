package com.nhnacademy.resident.model;

import java.time.LocalDate;

public interface CertificateIssueDto {
    Long getCertificateConfirmationNumber();

    LocalDate getCertificateIssueDate();
}
