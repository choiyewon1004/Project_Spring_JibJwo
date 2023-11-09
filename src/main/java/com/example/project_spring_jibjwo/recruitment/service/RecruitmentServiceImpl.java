package com.example.project_spring_jibjwo.recruitment.service;

import com.example.project_spring_jibjwo.api.RecruitmentClient;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RecruitmentServiceImpl implements RecruitmentService{
    @Value("${api-key.my-home}")
    private String serviceKey;
    private final RecruitmentClient recruitmentClient;

    @Override
    public void getRsdtData() {
        System.out.println(recruitmentClient.getData(serviceKey));
    }
}
