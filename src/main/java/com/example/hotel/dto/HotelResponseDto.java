package com.example.hotel.dto;

public class HotelResponseDto {
	private int hotelId;
	private String hotelName;
	private String address;
	private String contactNumber;
	private String message;

	public HotelResponseDto(String message) {
		this.message = message;
	}

	public HotelResponseDto() {
	}

	@Override
	public String toString() {
		return "HotelResponseDto [hotelId=" + hotelId + ", hotelName=" + hotelName + ", address=" + address
				+ ", contactNumber=" + contactNumber + ", message=" + message + "]";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

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

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

}
