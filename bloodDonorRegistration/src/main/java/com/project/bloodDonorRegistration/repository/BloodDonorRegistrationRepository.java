package com.project.bloodDonorRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.bloodDonorRegistration.entity.BloodDonorRegistrationEntity;

public interface BloodDonorRegistrationRepository extends JpaRepository<BloodDonorRegistrationEntity, Integer> {

}
