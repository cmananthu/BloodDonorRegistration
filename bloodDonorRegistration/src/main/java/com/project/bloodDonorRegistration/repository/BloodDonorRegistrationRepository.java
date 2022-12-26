package com.project.bloodDonorRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.bloodDonorRegistration.entity.BloodDonorRegistrationEntity;

@Repository
public interface BloodDonorRegistrationRepository extends JpaRepository<BloodDonorRegistrationEntity, Integer> {
	BloodDonorRegistrationEntity findByEmail(String email);
	BloodDonorRegistrationEntity findById(int id);
}
