package com.example.project_spring_jibjwo.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "recruitment", url = "https://apis.data.go.kr/1613000/HWSPR02")
public interface RecruitmentClient {

    @GetMapping("/rsdtRcritNtcList")
    Object getData(@RequestParam("serviceKey") String serviceKey);
}
