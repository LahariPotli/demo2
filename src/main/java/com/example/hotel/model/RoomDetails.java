package com.example.hotel.model;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity
public class RoomDetails {
	@Id
	private String roomId;
	private int roomNumner;
	private int hotelId;
	private String roomType;
	private int roomCapacity;
	private double price;
	@ElementCollection
	private List<RoomStatus> roomStatus = new ArrayList<>();

	@CollectionTable(name = "RoomStatus", joinColumns = @JoinColumn(name = "roomStatus_Id"))

	public String getRoomId() {
		return roomId;
	}

	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}

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

	public List<RoomStatus> getRoomStatus() {
		return roomStatus;
	}

	public void setRoomStatus(List<RoomStatus> roomStatus) {
		this.roomStatus = roomStatus;
	}

	@Override
	public String toString() {
		return "RoomDetails [roomId=" + roomId + ", roomNumner=" + roomNumner + ", hotelId=" + hotelId + ", roomType="
				+ roomType + ", roomCapacity=" + roomCapacity + ", price=" + price + ", roomStatus=" + roomStatus + "]";
	}
}
