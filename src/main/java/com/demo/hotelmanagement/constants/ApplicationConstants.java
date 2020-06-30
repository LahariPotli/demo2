package com.demo.hotelmanagement.constants;

import org.springframework.http.HttpStatus;

public class ApplicationConstants {
	
	private ApplicationConstants() {
		
	}
	public static final String ROOM_DETAILS = "Please find the above room details";
	public static final String ROOM_UNAVAILABLE = "No rooms available";
	public static final String HOTEL_UNAVAILABLE = "No hotel is available at this location";
	public static final Integer UNSUCCESS_CODE = HttpStatus.NOT_FOUND.value();
	public static final Integer SUCCESS_CODE = HttpStatus.OK.value();
	public static final String HOTEL_AVAILABLE = "Please find the below list of hotels in this location";
	
}