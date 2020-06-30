package com.demo.hotelmanagement.model;

import javax.persistence.Entity;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
* Generates PriceDetails  table with priceDetailsId,
* roomType,price and roomOptionId
*/
@Entity
public class PriceDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	Long priceDetailsId;
	@Enumerated(EnumType.STRING)
	RoomType roomType;
	Long price;
	Long roomOptionId;
	
	public Long getPriceDetailsId() {
		return priceDetailsId;
	}
	public void setPriceDetailsId(Long priceDetailsId) {
		this.priceDetailsId = priceDetailsId;
	}
	public RoomType getRoomType() {
		return roomType;
	}
	public void setRoomType(RoomType roomType) {
		this.roomType = roomType;
	}
	
	public Long getRoomOptionId() {
		return roomOptionId;
	}
	public void setRoomOptionId(Long roomOptionId) {
		this.roomOptionId = roomOptionId;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
}
