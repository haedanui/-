package com.nhnacademy.resident.Controller;

import com.nhnacademy.resident.model.*;
import com.nhnacademy.resident.service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


import java.util.List;
import java.util.Objects;

@Controller
@RequestMapping("/registration")
@RequiredArgsConstructor
public class ResidentRegistrationController {
    private final ResidentService residentService;
    private final HouseholdService householdService;
    private final HouseholdMovementAddressService householdMovementAddressService;
    private final HouseholdCompositionResidentService householdCompositionResidentService;
    private final CertificateIssueService certificateIssueService;


    @GetMapping("/{name}")
    public String getRegistration(@PathVariable("name") String name, Model model) {

        ResidentDto residentDto = residentService.findByName(name);
        if (Objects.isNull(residentDto)) {
            throw new IllegalArgumentException("해당하는 이름을 찾을 수 없습니다." + name);
        }
        Long residentNumber = residentDto.getResidentSerialNumber();

        String typeCode = "주민등록등본";
        CertificateIssueDto certificateIssueDto = certificateIssueService.findByNumber(residentNumber, typeCode);



        HouseholdDto householdDto = householdService.findByNumber(residentNumber);
        if(Objects.isNull(householdDto)){
            throw new IllegalArgumentException("해당하는 주민의 번호를 찾을 수 없습니다. : " + residentNumber);
        }

        Long householdNumber = householdDto.getHouseholdSerialNumber();

        List<HouseholdMovementAddressDto> householdMovementAddressDtoList = householdMovementAddressService.findByHouseholdSerialNumber(householdNumber);

        List<HouseholdCompositionResidentDto> householdCompositionResidentDtoList = householdCompositionResidentService.findByHouseholdHouseholdSerialNumber(householdNumber);

        Long firstNumber = certificateIssueDto.getCertificateConfirmationNumber()/100000000;
        Long lastNumber = certificateIssueDto.getCertificateConfirmationNumber()%100000000;


        //증명서 발급
        model.addAttribute("certificateIssueDto",certificateIssueDto);
        model.addAttribute("firstNumber", firstNumber);
        model.addAttribute("lastNumber" ,lastNumber);
        //증명서 발급 끝

        //세대
        model.addAttribute("residentDto", residentDto);
        model.addAttribute("householdDto", householdDto);
        //세대 끝

        //세대전입주소
        model.addAttribute("householdMovementAddressDtoList", householdMovementAddressDtoList);
        //세대전입주소 끝

        //세대구성주민
        model.addAttribute("householdCompositionResidentDtoList", householdCompositionResidentDtoList);

        //세대구성주민 끝
        return "registration";
    }
}
