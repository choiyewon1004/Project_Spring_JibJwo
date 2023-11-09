package com.example.project_spring_jibjwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProjectSpringJibJwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectSpringJibJwoApplication.class, args);
    }

}
