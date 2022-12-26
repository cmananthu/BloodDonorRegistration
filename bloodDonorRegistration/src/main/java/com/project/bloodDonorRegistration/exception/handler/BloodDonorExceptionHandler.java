package com.project.bloodDonorRegistration.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.project.bloodDonorRegistration.exceptions.UserAlreadyFoundException;

@ControllerAdvice
public class BloodDonorExceptionHandler {
	
	@ExceptionHandler(value = UserAlreadyFoundException.class)
	   public ResponseEntity<Object> exception(UserAlreadyFoundException exception) {
	      return new ResponseEntity<>(exception.getMessage(), HttpStatus.ALREADY_REPORTED);
	   }
}
