package com.project.bloodDonorRegistration.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="donorAuth")
public class BloodDonorRegistrationEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String donorName;
	@Column(unique = true)
	private String email;
	private String phoneNumber;
	private String donorPassWord;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getPassWord() {
		return donorPassWord;
	}
	public void setPassWord(String passWord) {
		this.donorPassWord = passWord;
	}
	public BloodDonorRegistrationEntity(int id, String donorName, String email, String phoneNumber, String donorPassWord) {
		super();
		this.id = id;
		this.donorName = donorName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.donorPassWord = donorPassWord;
	}
	public BloodDonorRegistrationEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BloodDonorRegistrationEntity [id=" + id + ", donorName=" + donorName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", donorPassWord=" + donorPassWord + "]";
	}
	
	
 
}
