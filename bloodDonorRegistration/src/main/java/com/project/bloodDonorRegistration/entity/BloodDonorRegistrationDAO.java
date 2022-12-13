package com.project.bloodDonorRegistration.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BloodDonorRegistrationDAO {
	private int id;
	@JsonProperty("name")
	private String donorName;
	
	private String email;
	@JsonProperty("phone")
	private String phoneNumber;
	@JsonProperty("password")
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
	public void setPassWord(String donorPassWord) {
		this.donorPassWord = donorPassWord;
	}
	public BloodDonorRegistrationDAO(int id, String donorName, String email, String phoneNumber, String donorPassWord) {
		super();
		this.id = id;
		this.donorName = donorName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.donorPassWord = donorPassWord;
	}
	public BloodDonorRegistrationDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "BloodDonorRegistrationEntity [id=" + id + ", donorName=" + donorName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", donorPassWord=" + donorPassWord + "]";
	}
	
	
}
