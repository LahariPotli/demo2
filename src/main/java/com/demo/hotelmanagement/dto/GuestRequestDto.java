package com.demo.hotelmanagement.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement(name="GuestRequestDto")
@XmlAccessorType(XmlAccessType.FIELD) 
public class GuestRequestDto {
	@NotNull
    @Size(min=3,max=15,message="required")
	String guestName;
	@NotNull
	@Min(18)
	@Max(80)
	int age;
	
	public String getGuestName() {
		return guestName;
	}
	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
