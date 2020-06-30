package com.example.hotel.serviceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotel.dao.GuestDao;
import com.example.hotel.dto.GuestRequestDto;
import com.example.hotel.model.GuestDetails;
import com.example.hotel.service.GuestService;
import org.apache.commons.logging.Log;

@Service
public class GuestServiceImpl implements GuestService {

	private static Log logger = LogFactory.getLog(GuestServiceImpl.class);
	@Autowired
	GuestDao guestDao;

	@Override
	public void addGuestDetails(List<GuestRequestDto> guestRequestDtoList, int bookingId) {

		logger.info("Inside based on bookingid guest details added of  Guest servic impl");
		
		guestRequestDtoList.stream().map(guestRequestDto -> addGuest(guestRequestDto, bookingId))
				.collect(Collectors.toList());

	}

	public Object addGuest(GuestRequestDto guestRequestDto, int bookingId) {
		logger.info("Inside based on bookingid guest details added of  Guest servic impl");

		GuestDetails guestDetails = new GuestDetails();
		guestDetails.setBookingId(bookingId);
		guestDetails.setAge(guestRequestDto.getAge());
		guestDetails.setGender(guestRequestDto.getGender());
		guestDetails.setName(guestRequestDto.getName());
		guestDao.save(guestDetails);

		return "success";
	}

}
