package com.Model_API;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.Model_API.controller", "com.Model_API.service", "com.Model_API.repository"})
public class ModelApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModelApiApplication.class, args);
	}

}
