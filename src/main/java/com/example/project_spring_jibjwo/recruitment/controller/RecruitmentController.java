package com.example.project_spring_jibjwo.recruitment.controller;

import com.example.project_spring_jibjwo.recruitment.service.RecruitmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/myhome")
public class RecruitmentController {
    private final RecruitmentService recruitmentService;

    @GetMapping("/rcripList")
    public void getRcripList() {
        recruitmentService.getRsdtData();
    }
}
