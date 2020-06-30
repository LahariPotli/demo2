package com.demo.hotelmanagement.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.demo.hotelmanagement.model.RoomType;

public class RoomDetailDto {
	
	public RoomDetailDto() {
		super();
	}
	public RoomDetailDto(String message) {
		super();
		this.message = message;
	}
	@Enumerated(EnumType.STRING)
	RoomType roomType;
	double price;
	int available;
	String hotelName;
	String message;
	Long roomOptionId;
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public RoomType getRoomType() {
		return roomType;
	}
	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Long getRoomOptionId() {
		return roomOptionId;
	}
	public void setRoomOptionId(Long roomOptionId) {
		this.roomOptionId = roomOptionId;
	}
	

}
