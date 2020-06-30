package com.example.hotel.dto;

import com.example.hotel.model.RoomStatus;

public class RoomResponseDto {

	private int roomNumner;
	private int hotelId;
	private String roomType;
	private int roomCapacity;
	private double price;
	private RoomStatus roomStatus;

	public int getRoomNumner() {
		return roomNumner;
	}

	public void setRoomNumner(int roomNumner) {
		this.roomNumner = roomNumner;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public int getRoomCapacity() {
		return roomCapacity;
	}

	public void setRoomCapacity(int roomCapacity) {
		this.roomCapacity = roomCapacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public RoomStatus getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(RoomStatus roomStatus) {
		this.roomStatus = roomStatus;
	}

}
