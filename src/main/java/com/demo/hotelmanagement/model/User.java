package com.demo.hotelmanagement.model;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import lombok.Getter;
import lombok.Setter;

/**
 * Generates User table with userId, userName,password ,location,location and
 * contactNumber
 * 
 *
 */
@Entity
@Getter
@Setter
@XmlRootElement(name="User")
@XmlAccessorType(XmlAccessType.FIELD) 
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	Long userId;
	@NotNull
	@NotEmpty
	@Size(min=3,max=20,message="username is required")
	String userName;
	@NotNull
	@NotEmpty
	@Size(max=15,message="password is required")
	String password;
	@NotNull
	@NotEmpty
	@Size(max=10,message="location should not be blank")
	String location;
	@NotNull
	@NotEmpty
	@Size(max=20,message="address should not be blank")
	String address;
	@NotNull
	@NotEmpty
	@Size(min=10,max=10,message="required")

	String contactNumber;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	
}
