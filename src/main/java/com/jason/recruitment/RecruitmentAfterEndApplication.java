package com.jason.recruitment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.jason.recruitment.dao")
public class RecruitmentAfterEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecruitmentAfterEndApplication.class, args);
	}
}
