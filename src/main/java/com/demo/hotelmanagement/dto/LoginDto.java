package com.demo.hotelmanagement.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="LoginDto")
@XmlAccessorType(XmlAccessType.FIELD) 
public class LoginDto {
	 @NotNull
	    @Size(min=3,max=15,message="required")
    private String userName;
	 @NotNull
	    @Size(min=3,message="required")
    private String password;
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

 

}