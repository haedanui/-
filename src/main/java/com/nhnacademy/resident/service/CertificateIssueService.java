package com.nhnacademy.resident.service;

import com.nhnacademy.resident.model.CertificateIssueDto;

import java.util.List;

public interface CertificateIssueService {

    CertificateIssueDto findByNumber(Long residentNumber, String typeCode);
}
