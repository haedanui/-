package com.nhnacademy.resident.Controller;

import com.nhnacademy.resident.model.ResidentDto;
import com.nhnacademy.resident.service.ResidentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@RequestMapping("/list")
public class ResidentController {
    private final ResidentService residentService;

    public ResidentController(ResidentService residentService) {
        this.residentService = residentService;
    }

    @GetMapping
    public String getResident(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "3")int size, Model model){
        Pageable pageable = PageRequest.of(page, size);
        Page<ResidentDto> pageView = residentService.getAllBy(pageable);
        List<ResidentDto> list = pageView.getContent();
        model.addAttribute("page", pageView);
        model.addAttribute("list", list);
        return "list";
    }
}
