package com.example.hote.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotel.dto.HotelRequestDto;
import com.example.hotel.dto.HotelResponseDto;
import com.example.hotel.dto.RoomResponseDto;
import com.example.hotel.service.HotelService;

@RestController
public class HotelController {
	@Autowired
	HotelService hotelservice;
	private static Log logger = LogFactory.getLog(HotelController.class);

	/**
	 * This method is used to search the hotels
	 * 
	 * @param hotelDto
	 * @return hotel details
	 */
	@PostMapping("/hotel/searchhotel")
	public ResponseEntity<List<HotelResponseDto>> findHotelDetails(@RequestBody HotelRequestDto hotelRequestDto) {
		logger.info("Inside Searching based on date and location getting hotel details");
		List<HotelResponseDto> hotelResponsedto = hotelservice.searchHotelDetails(hotelRequestDto);

		return new ResponseEntity<List<HotelResponseDto>>(hotelResponsedto, HttpStatus.OK);

	}

	/**
	 * This method is used to get the room details
	 * 
	 * @param hotelid
	 * @return room details
	 */

	@GetMapping("/hotel/{hotelId}/roomdetails")
	public ResponseEntity<List<RoomResponseDto>> findRoomDetails(@PathVariable("hotelId") int hotelId) {
		logger.info("Inside Searching based on hotelid getting room details");
		List<RoomResponseDto> roomResponsedto = hotelservice.searchRoomDetails(hotelId);

		return new ResponseEntity<List<RoomResponseDto>>(roomResponsedto, HttpStatus.OK);

	}

}
