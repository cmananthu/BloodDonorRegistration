package com.project.bloodDonorRegistration.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.bloodDonorRegistration.entity.BloodDonorRegistrationDAO;
import com.project.bloodDonorRegistration.entity.BloodDonorRegistrationEntity;
import com.project.bloodDonorRegistration.exceptions.UserAlreadyFoundException;

@Service
public interface BloodDonorRegistrationService {
	void registerNewDonor(BloodDonorRegistrationDAO bloodDonorRegistrationDAO) throws UserAlreadyFoundException ;
	boolean getAuthentication(BloodDonorRegistrationDAO bloodDonorRegistrationDAO) ;
}
