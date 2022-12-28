package com.project.bloodDonorRegistration.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.bloodDonorRegistration.Util.BloodDonorRegistrationUtil;
import com.project.bloodDonorRegistration.entity.BloodDonorRegistrationDAO;
import com.project.bloodDonorRegistration.entity.BloodDonorRegistrationEntity;
import com.project.bloodDonorRegistration.exceptions.UserAlreadyFoundException;
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
	public void registerNewDonor(BloodDonorRegistrationDAO bloodDonorRegistrationDAO) throws UserAlreadyFoundException {
		
		BloodDonorRegistrationEntity ety= repo.findByEmail(bloodDonorRegistrationDAO.getEmail());
		if(ety==null) {
		BloodDonorRegistrationEntity entity=BloodDonorRegistrationUtil.createBloodDonorRegistraionEntity(bloodDonorRegistrationDAO);
		
		repo.save(entity);
		}else
			throw  new UserAlreadyFoundException("This user is already registered");
	}

	@Override
	public boolean getAuthentication(BloodDonorRegistrationDAO bloodDonorRegistrationDAO) {
		if(bloodDonorRegistrationDAO.getEmail()!="" && bloodDonorRegistrationDAO.getPassWord()!="") {
		BloodDonorRegistrationEntity ety= repo.findByEmail(bloodDonorRegistrationDAO.getEmail());
		if(ety!=null) {
		BloodDonorRegistrationDAO dao=BloodDonorRegistrationUtil.createBloodDonorRegistraionDao(ety);
		
		String s2=bloodDonorRegistrationDAO.getPassWord();
		if( dao.getPassWord().equals(s2))
			return true;
		else
			return false;
		
		}else
			return false;
		}else {
			return false;
		}
		
	}

	@Override
	public Object getMyProfile(BloodDonorRegistrationDAO bloodDonorRegistrationDAO) {
		Object obj=null;
		if(bloodDonorRegistrationDAO.getEmail()!="" && bloodDonorRegistrationDAO.getPassWord()!="") {
			BloodDonorRegistrationEntity ety= repo.findByEmail(bloodDonorRegistrationDAO.getEmail());
			if(ety!=null) {
			BloodDonorRegistrationDAO dao=BloodDonorRegistrationUtil.createBloodDonorRegistraionDao(ety);
			
			String s2=bloodDonorRegistrationDAO.getPassWord();
			if( dao.getPassWord().equals(s2)) {
		
				String email=bloodDonorRegistrationDAO.getEmail();
				 String url="http://localhost:8085/bloodbank/myprofile/"+email;
				 RestTemplate restTemplate = new RestTemplate();
				 obj=restTemplate.getForEntity(url, Object.class); 
				
				
			}else {
				obj="password incorrect";
			}
			}
		}
		return obj;
				
	}
	
	


}
