package com.project.bloodDonorRegistration.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.bloodDonorRegistration.Util.BloodDonorRegistrationUtil;
import com.project.bloodDonorRegistration.entity.BloodDonorRegistrationDAO;
import com.project.bloodDonorRegistration.entity.BloodDonorRegistrationEntity;
import com.project.bloodDonorRegistration.repository.BloodDonorRegistrationRepository;
import com.project.bloodDonorRegistration.service.BloodDonorRegistrationService;

@Service
public class BloodDonorRegistrationServiceImpl implements BloodDonorRegistrationService {

	//repo contains crud methods
	@Autowired
	BloodDonorRegistrationRepository repo;
	
//	@Autowired
//	PasswordEncoder encoder;
	
	
	
	//method to add a new donor
	//Util class convert front end data to back end data
	@Override
	public void registerNewDonor(BloodDonorRegistrationDAO bloodDonorRegistrationDAO) {
		BloodDonorRegistrationEntity entity=BloodDonorRegistrationUtil.createBloodDonorRegistraionEntity(bloodDonorRegistrationDAO);
		
		repo.save(entity);
	}


}
