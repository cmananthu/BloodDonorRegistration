package com.project.bloodDonorRegistration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.bloodDonorRegistration.entity.BloodDonorRegistrationDAO;
import com.project.bloodDonorRegistration.exceptions.UserAlreadyFoundException;
import com.project.bloodDonorRegistration.service.BloodDonorRegistrationService;

@CrossOrigin("*")
@RestController
public class BloodDonorRegistrationController {

	@Autowired
	BloodDonorRegistrationService service;
	
	
	//End point for register new donor
	//localhost:8090/bloodbank/register
	@PostMapping("/register")
	public ResponseEntity<String> addNewUser( @Validated @RequestBody BloodDonorRegistrationDAO dao) throws UserAlreadyFoundException{
		service.registerNewDonor(dao);
		return new ResponseEntity("Succesfully added new donor",HttpStatus.CREATED);
	}
	
	//localhost:8090/bloodbank/login
	@PostMapping("/login")
	public boolean getLoginUpdate( @Validated @RequestBody BloodDonorRegistrationDAO dao){
		
		return service.getAuthentication(dao);
	}
	@GetMapping("/hello")
	public String helo() {
		return "hello";
	}
}
