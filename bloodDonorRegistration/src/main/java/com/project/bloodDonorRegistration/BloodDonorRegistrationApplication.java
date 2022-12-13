package com.project.bloodDonorRegistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan(basePackages = {"com.project.bloodDonorRegistration.controller"} )
public class BloodDonorRegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(BloodDonorRegistrationApplication.class, args);
	}

}
