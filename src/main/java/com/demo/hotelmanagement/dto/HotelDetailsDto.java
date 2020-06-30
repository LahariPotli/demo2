package com.demo.hotelmanagement.dto;

public class HotelDetailsDto {
	
	Long hotelId;
	String hotelName;
	String location;
	String address;
	String contactNumber;
	int roomsAvailable;
	int familyRoom;
	int singleRoom;
	int doubleRoom;
	int tripleRoom;
	int villa;
	public Long getHotelId() {
		return hotelId;
	}
	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
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
	public int getRoomsAvailable() {
		return roomsAvailable;
	}
	public void setRoomsAvailable(int roomsAvailable) {
		this.roomsAvailable = roomsAvailable;
	}
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
	

}
