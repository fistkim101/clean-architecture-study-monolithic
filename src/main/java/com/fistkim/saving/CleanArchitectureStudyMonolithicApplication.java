package com.fistkim.saving;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CleanArchitectureStudyMonolithicApplication {

    public static void main(String[] args) {
        SpringApplication.run(CleanArchitectureStudyMonolithicApplication.class, args);
    }

}
