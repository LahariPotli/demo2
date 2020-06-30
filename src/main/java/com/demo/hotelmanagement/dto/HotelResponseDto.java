package com.demo.hotelmanagement.dto;

import java.util.List;

public class HotelResponseDto {
	
	
	
	List<HotelDetailsDto> hotelDetailsDtoList;
	
	public List<HotelDetailsDto> getHotelDetailsDtoList() {
		return hotelDetailsDtoList;
	}
	public void setHotelDetailsDtoList(List<HotelDetailsDto> hotelDetailsDtoList) {
		this.hotelDetailsDtoList = hotelDetailsDtoList;
	}
	

}
