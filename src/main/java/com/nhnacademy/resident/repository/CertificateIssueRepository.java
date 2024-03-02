package com.nhnacademy.resident.repository;

import com.nhnacademy.resident.entity.CertificateIssue;
import com.nhnacademy.resident.model.CertificateIssueDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CertificateIssueRepository extends JpaRepository<CertificateIssue, Long> {

    @Query("select h from CertificateIssue h where h.resident.residentSerialNumber = :residentSerialNumber and h.certificateTypeCode =:typeCode")
    CertificateIssueDto findAllByResidentSerialNumber(@Param("residentSerialNumber") Long residentNumber, @Param("typeCode") String typeCode);
}
