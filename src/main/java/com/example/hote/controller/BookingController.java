package com.example.hote.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotel.dto.BookingRequestDto;
import com.example.hotel.dto.BookingResponseDto;
import com.example.hotel.dto.GuestRequestDto;
import com.example.hotel.service.BookingService;
import com.example.hotel.service.GuestService;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
public class BookingController {
	private static Log logger = LogFactory.getLog(UserController.class);

	@Autowired
	BookingService bookingService;

	@Autowired
	GuestService guestService;

	/**
	 * This method is used to get the booking room
	 * 
	 * @param BookingRequestDto
	 * @return BookingResponseDto
	 */
	@PostMapping("/booking")
	public ResponseEntity<BookingResponseDto> bookingDetails(@RequestBody BookingRequestDto bookingRequestDto) {
		logger.info("inside saving booking details");
		BookingResponseDto bookingResponseDto = bookingService.bookingDetails(bookingRequestDto);
		return new ResponseEntity<BookingResponseDto>(bookingResponseDto, HttpStatus.CREATED);
	}

	/**
	 * This method is used to get the guest
	 * 
	 * @param bookingId
	 * @return guest details added
	 */
	@PostMapping("booking/{bookingId}/guest")
	public ResponseEntity<String> addguestDetails(@RequestBody List<GuestRequestDto> guestRequestDtoList,
			@PathVariable("bookingId") int bookingId) {
		logger.info("inside searching basedon bookingid add guest details");
		guestService.addGuestDetails(guestRequestDtoList, bookingId);
		return new ResponseEntity<String>("Guest details added", HttpStatus.CREATED);
	}
}
