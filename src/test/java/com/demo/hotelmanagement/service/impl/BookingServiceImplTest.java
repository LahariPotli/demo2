package com.demo.hotelmanagement.service.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.demo.hotelmanagement.dao.BookingDao;
import com.demo.hotelmanagement.dao.GuestDao;
import com.demo.hotelmanagement.dao.HotelDao;
import com.demo.hotelmanagement.dao.PriceDetailsDao;
import com.demo.hotelmanagement.dao.RoomOptionsDao;
import com.demo.hotelmanagement.dao.UserDao;
import com.demo.hotelmanagement.dto.BookingRequestDto;
import com.demo.hotelmanagement.dto.GuestRequestDto;
import com.demo.hotelmanagement.dto.ResponseDto;
import com.demo.hotelmanagement.model.Booking;
import com.demo.hotelmanagement.model.Guest;
import com.demo.hotelmanagement.model.RoomOptions;
import com.demo.hotelmanagement.model.User;

@ExtendWith(MockitoExtension.class)
public class BookingServiceImplTest {

	@Mock
	UserDao userDao;

	@Mock
	BookingDao bookingDao;

	@Mock
	HotelDao hotelDao;

	@Mock
	PriceDetailsDao priceDetailsDao;

	@Mock
	RoomOptionsDao roomOptionsDao;

	@Mock
	GuestDao guestDao;

	@InjectMocks
	BookingServiceImpl bookingServiceImpl;

	@BeforeEach
	public void setUp() {

	}

	@Test
	public void bookRoomTest() {
		BookingRequestDto bookingRequestDto = new BookingRequestDto();
		List<BookingRequestDto> bookingRequestDtoList = new ArrayList<>();

		bookingRequestDto.setCheckIn("09:00:00");
		bookingRequestDto.setCheckOut("09:00:00");
		bookingRequestDto.setDate("2020-06-30");

		GuestRequestDto guestRequestDto = new GuestRequestDto();

		guestRequestDto.setAge(23);
		guestRequestDto.setGuestName("suma");

		Guest guest = new Guest();
		guest.setAge(20);
		guest.setBookingId(1L);
		guest.setGuestId(1L);
		guest.setGuestName("test");
		List<GuestRequestDto> guestRequestDtoList = new ArrayList<>();

		guestRequestDtoList.add(guestRequestDto);

		bookingRequestDto.setGuestRequestDtoList(guestRequestDtoList);

		bookingRequestDtoList.add(bookingRequestDto);

		ResponseDto responseDto = new ResponseDto();
		responseDto.setMessage("booking confirmed");
		responseDto.setStatusCode(201);
		RoomOptions roomOptions = new RoomOptions();
		roomOptions.setAvailableDate(LocalDate.parse("2020-06-30"));
		roomOptions.setDoubleRoom(20);
		roomOptions.setFamilyRoom(20);
		roomOptions.setHotelId(1L);
		roomOptions.setRoomOptionId(1L);
		roomOptions.setSingleRoom(20);
		roomOptions.setTripleRoom(20);
		roomOptions.setVilla(20);

		User user = new User();
		user.setUserName("test");
		user.setPassword("test");
		user.setLocation("testLocation");
		user.setContactNumber("7364");
		user.setAddress("testAddress");
		user.setUserId(1L);
		// when(bookingDao.save(any(Booking.class))).thenReturn(any(Booking.class));
		bookingDao.save(any(Booking.class));
		guestDao.save(any(Guest.class));
		
		
		when(roomOptionsDao.findByRoomOptionId(1L)).thenReturn(Optional.of(roomOptions));
		when(userDao.findByUserId(1L)).thenReturn(Optional.of(user));
		assertThat(roomOptionsDao.findByRoomOptionId(1L).isPresent()) ;
		assertThat((userDao.findByUserId(1L).isPresent()));	
		when(bookingServiceImpl.bookRoom(bookingRequestDtoList, "SINGE", 1L)).thenReturn(responseDto);
		when(guestDao.save(any(Guest.class))).thenReturn(any(Guest.class));
		verify(guestDao).save(any(Guest.class));

		verify(bookingDao).save(any(Booking.class));
	}

}
