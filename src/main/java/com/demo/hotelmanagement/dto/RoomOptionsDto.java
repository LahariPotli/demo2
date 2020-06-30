package com.demo.hotelmanagement.dto;

import java.time.LocalDate;

public class RoomOptionsDto {
	Long roomOptionId;
	int familyRoom;
	int singleRoom;
	int doubleRoom;
	int tripleRoom;
	int villa;
	Long hotelId;
	LocalDate availableDate;
	public int getFamilyRoom() {
		return familyRoom;
	}
	public void setFamilyRoom(int familyRoom) {
		this.familyRoom = familyRoom;
	}
	public int getSingleRoom() {
		return singleRoom;
	}
	public void setSingleRoom(int singleRoom) {
		this.singleRoom = singleRoom;
	}
	public int getDoubleRoom() {
		return doubleRoom;
	}
	public void setDoubleRoom(int doubleRoom) {
		this.doubleRoom = doubleRoom;
	}
	public int getTripleRoom() {
		return tripleRoom;
	}
	public void setTripleRoom(int tripleRoom) {
		this.tripleRoom = tripleRoom;
	}
	public int getVilla() {
		return villa;
	}
	public void setVilla(int villa) {
		this.villa = villa;
	}
	public Long getHotelId() {
		return hotelId;
	}
	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}
	public LocalDate getAvailableDate() {
		return availableDate;
	}
	public void setAvailableDate(LocalDate availableDate) {
		this.availableDate = availableDate;
	}
	public Long getRoomOptionId() {
		return roomOptionId;
	}
	public void setRoomOptionId(Long roomOptionId) {
		this.roomOptionId = roomOptionId;
	}
}
