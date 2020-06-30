package com.example.hotel.serviceImpl;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotel.dao.BookingDao;
import com.example.hotel.dto.BookingRequestDto;
import com.example.hotel.dto.BookingResponseDto;
import com.example.hotel.model.BookingDetails;
import com.example.hotel.service.BookingService;

@Service
public class BookingServiceImpl implements BookingService {

	private static Log logger = LogFactory.getLog(BookingServiceImpl.class);
	@Autowired
	BookingDao bookingDao;

	@Override
	public BookingResponseDto bookingDetails(BookingRequestDto bookingRequestDto) {
		logger.info("Inside adding booking details");

		BookingDetails bookingdetails = new BookingDetails();

		bookingdetails.setUserId(bookingRequestDto.getUserId());
		bookingdetails.setRoomId(bookingRequestDto.getRoomId());
		bookingdetails.setNoOfGuest(bookingRequestDto.getNoOfGuest());

		LocalDate date = LocalDate.parse(bookingRequestDto.getCheckInDate());
		bookingdetails.setCheckInDate(date);
		LocalDate date1 = LocalDate.parse(bookingRequestDto.getCheckOutDate());
		bookingdetails.setCheckOutDate(date1);

		LocalTime time = LocalTime.parse(bookingRequestDto.getCheckInTime());
		bookingdetails.setCheckInTime(time);
		LocalTime time1 = LocalTime.parse(bookingRequestDto.getCheckOutTime());
		bookingdetails.setCheckOutTime(time1);

		bookingDao.save(bookingdetails);

		Optional<BookingDetails> bookingDetailsList = bookingDao.findAllByRoomId(bookingRequestDto.getRoomId());

		BookingResponseDto bookingResponeDto = new BookingResponseDto();

		bookingResponeDto.setBookingId(bookingDetailsList.get().getBookingID());
		bookingResponeDto.setMessage("Booking got successfully Add Guest Details");
		return bookingResponeDto;
	}

}
