package com.demo.hotelmanagement.service;

import java.util.List;

import com.demo.hotelmanagement.dto.BookingDetailsRequestDto;
import com.demo.hotelmanagement.dto.BookingRequestDto;
import com.demo.hotelmanagement.dto.ResponseDto;
import com.demo.hotelmanagement.dto.RoomDetailDto;

public interface BookingService {
	
	/**
	 * This method is used to book a room 
	 * @param bookingRequestDtoList
	 * @param roomType
	 * @param roomOptionId
	 * @return booking room details
	 */
	ResponseDto bookRoom(List<BookingRequestDto> bookingRequestDtoList,String roomType,Long roomOptionId);

	/**
	 * @param bookingDetailsRequestDto
	 * @return customerdetails
	 */
	RoomDetailDto getCustomeHotelDetails( BookingDetailsRequestDto bookingDetailsRequestDto);

}
