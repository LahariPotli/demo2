package com.demo.hotelmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.hotelmanagement.dto.HotelResponseDto;
import com.demo.hotelmanagement.dto.RoomOptionsDto;
import com.demo.hotelmanagement.service.HotelService;

@RestController
public class HotelController {
	@Autowired
	HotelService hotelService;
	@GetMapping("/hotels")
	public ResponseEntity<HotelResponseDto> getHotelsByLocation(@RequestParam(value="location") String location,@RequestParam(value="date") String date)
	{
		return new ResponseEntity<>(hotelService.getHotelsByLocation(location,date),HttpStatus.OK);
		
	}
	
	@GetMapping("/hotels/{hotelId}/roomOptions")
    public ResponseEntity<List<RoomOptionsDto>> getRoomOptionsByHotelId(@PathVariable("hotelId") Long hotelId) {
       
        
            return new ResponseEntity<>(hotelService.getAllRoomOptionsByHotelId(hotelId), HttpStatus.OK);
    }

}
