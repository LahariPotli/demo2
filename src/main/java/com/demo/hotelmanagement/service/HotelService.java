package com.demo.hotelmanagement.service;

import java.util.List;

import com.demo.hotelmanagement.dto.HotelResponseDto;
import com.demo.hotelmanagement.dto.RoomOptionsDto;

/**
 * @author 91970
 *
 */
public interface HotelService {

	/**
	 * This method is used to get hotelDetailsByLocation
	 * @param location
	 * @param date
	 * @return
	 */
	HotelResponseDto getHotelsByLocation(String location, String date);

	List<RoomOptionsDto> getAllRoomOptionsByHotelId(Long hotelId);


}
