package com.example.learnman.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="login_users")
public class UsersLogin{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int userId;
	String fullName;
	String phoneNumber;
	String emailId;
	String password;
	String country;
	String state;
	String city;
	String address;
	String postalAddress;
	String gender;
	String refereal;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPostalAddress() {
		return postalAddress;
	}
	public void setPostalAddress(String postalAddress) {
		this.postalAddress = postalAddress;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRefereal() {
		return refereal;
	}
	public void setRefereal(String refereal) {
		this.refereal = refereal;
	}
	@Override
	public String toString() {
		return "UsersLogin [userId=" + userId + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", emailId="
				+ emailId + ", password=" + password + ", country=" + country + ", state=" + state + ", city=" + city
				+ ", address=" + address + ", postalAddress=" + postalAddress + ", gender=" + gender + ", refereal="
				+ refereal + "]";
	}
	public UsersLogin(int userId, String fullName, String phoneNumber, String emailId, String password, String country,
			String state, String city, String address, String postalAddress, String gender, String refereal) {
		this.userId = userId;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
		this.password = password;
		this.country = country;
		this.state = state;
		this.city = city;
		this.address = address;
		this.postalAddress = postalAddress;
		this.gender = gender;
		this.refereal = refereal;
	}
	
	
}
