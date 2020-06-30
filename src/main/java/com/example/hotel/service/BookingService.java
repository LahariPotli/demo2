package com.example.hotel.service;

import com.example.hotel.dto.BookingRequestDto;
import com.example.hotel.dto.BookingResponseDto;

public interface BookingService {

	BookingResponseDto bookingDetails(BookingRequestDto bookingRequestDto);

}
