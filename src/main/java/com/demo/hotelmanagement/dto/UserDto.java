package com.demo.hotelmanagement.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="UserDto")
@XmlAccessorType(XmlAccessType.FIELD) 
public class UserDto {
	@NotNull
	@NotEmpty
	@Size(min=3,max=20,message="username is required")
	
    String userName;
	@NotNull
	@NotEmpty
	@Size(max=20,message="password is required")
    String password;
	
	@NotNull
	@NotEmpty
	@Size(max=10,message="location is required")
    String location;
	@NotNull
	@NotEmpty
	@Size(max=20,message="address is required")
    String address;
	@NotEmpty(message = "Phone number is required")

    @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$",

             message="contact number is invalid")
    String contactNumber;
    
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