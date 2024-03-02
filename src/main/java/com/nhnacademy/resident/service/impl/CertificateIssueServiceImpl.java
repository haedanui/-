package com.nhnacademy.resident.service.impl;

import com.nhnacademy.resident.model.CertificateIssueDto;
import com.nhnacademy.resident.repository.CertificateIssueRepository;
import com.nhnacademy.resident.service.CertificateIssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CertificateIssueServiceImpl implements CertificateIssueService {

    private final CertificateIssueRepository certificateIssueRepository;

    @Autowired
    public CertificateIssueServiceImpl(CertificateIssueRepository certificateIssueRepository) {
        this.certificateIssueRepository = certificateIssueRepository;
    }

    @Override
    public CertificateIssueDto findByNumber(Long residentNumber, String typeCode){
        return certificateIssueRepository.findAllByResidentSerialNumber(residentNumber, typeCode);
    }
}
