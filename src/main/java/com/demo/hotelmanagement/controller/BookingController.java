package com.demo.hotelmanagement.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.demo.hotelmanagement.dto.BookingDetailsRequestDto;
import com.demo.hotelmanagement.dto.BookingRequestDto;
import com.demo.hotelmanagement.dto.ResponseDto;
import com.demo.hotelmanagement.dto.RoomDetailDto;
import com.demo.hotelmanagement.service.BookingService;

@RestController
public class BookingController {
	
	private static Log logger = LogFactory.getLog(BookingController.class);
	@Autowired
	BookingService bookingService;
	/**
	 * @param bookingRequestDtoList
	 * @param roomType
	 * @param roomOptionId
	 * @return booking service
	 */
	
	@PostMapping("roomOptions/{roomOptionId}/bookings")
	public ResponseEntity<ResponseDto> bookRoom(@Valid @RequestBody List<BookingRequestDto> bookingRequestDtoList,@RequestParam(value="roomType") String roomType,@PathVariable("roomOptionId") Long roomOptionId)
	{
		logger.info("Inside booking room api in controller");
		
		return new ResponseEntity<>(bookingService.bookRoom(bookingRequestDtoList,roomType,roomOptionId),HttpStatus.OK);
		
	}
	
	/**
	 * @param bookingDetailsRequestDto
	 * @return custom Hotel details
	 */
	
	@PostMapping("/roomOptions")
	public ResponseEntity<RoomDetailDto> getCustomHotelDetails(@Valid @RequestBody BookingDetailsRequestDto bookingDetailsRequestDto)
	{
		logger.info("Inside roomoptions api in booking controller");
		
		return new ResponseEntity<>(bookingService.getCustomeHotelDetails(bookingDetailsRequestDto),HttpStatus.OK);
		
		
	}
	 @ResponseStatus(HttpStatus.BAD_REQUEST)

	    @ExceptionHandler(MethodArgumentNotValidException.class)

	    public Map<String, String> handleValidationExceptions(

	      MethodArgumentNotValidException ex) {

	        Map<String, String> errors = new HashMap<>();

	        ex.getBindingResult().getAllErrors().forEach((error) -> {

	            String fieldName = ((FieldError) error).getField();

	            String errorMessage = error.getDefaultMessage();

	            errors.put(fieldName, errorMessage);

	        });

	        return errors;

	    }
}
