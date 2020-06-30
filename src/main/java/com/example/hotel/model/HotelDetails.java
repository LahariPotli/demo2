package com.example.hotel.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HotelDetails {
	@Id
	private int hotelId;
	private String hotelName;
	private String address;
	private String location;
	private String contactNumber;

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	@Override
	public String toString() {
		return "HotelDetails [hotelId=" + hotelId + ", hotelName=" + hotelName + ", address=" + address + ", location="
				+ location + ", contactNumber=" + contactNumber + "]";
	}
}
