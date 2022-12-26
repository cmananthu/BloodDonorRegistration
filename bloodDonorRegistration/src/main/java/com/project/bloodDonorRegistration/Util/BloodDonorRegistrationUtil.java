package com.project.bloodDonorRegistration.Util;

import com.project.bloodDonorRegistration.entity.BloodDonorRegistrationDAO;
import com.project.bloodDonorRegistration.entity.BloodDonorRegistrationEntity;

public class BloodDonorRegistrationUtil {
//	@Autowired
//	static
//	PasswordEncoder encoder;
	
	//converts dao to entity
	public static BloodDonorRegistrationEntity createBloodDonorRegistraionEntity(BloodDonorRegistrationDAO dao) {
		BloodDonorRegistrationEntity entity=new BloodDonorRegistrationEntity();
		entity.setId(dao.getId());
		entity.setDonorName(dao.getDonorName());
		entity.setEmail(dao.getEmail());
		entity.setPhoneNumber(dao.getPhoneNumber());
		//entity.setPassWord(encoder.encode(dao.getPassWord()));
		entity.setPassWord(dao.getPassWord());
		return entity ;
	}
	
	//converts entity to dao
		public static BloodDonorRegistrationDAO createBloodDonorRegistraionDao(BloodDonorRegistrationEntity e) {
			BloodDonorRegistrationDAO d=new BloodDonorRegistrationDAO();
			d.setId(e.getId());
			d.setDonorName(e.getDonorName());
			d.setEmail(e.getEmail());
			d.setPhoneNumber(e.getPhoneNumber());
			//entity.setPassWord(encoder.encode(dao.getPassWord()));
			d.setPassWord(e.getPassWord());
			return d ;
		}

}
