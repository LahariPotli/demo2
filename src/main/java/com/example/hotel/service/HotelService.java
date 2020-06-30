package com.example.hotel.service;

import java.util.List;

import com.example.hotel.dto.HotelRequestDto;
import com.example.hotel.dto.HotelResponseDto;
import com.example.hotel.dto.RoomResponseDto;

public interface HotelService {

	List<HotelResponseDto> searchHotelDetails(HotelRequestDto hotelRequestDto);

	List<RoomResponseDto> searchRoomDetails(int hotelId);

}
