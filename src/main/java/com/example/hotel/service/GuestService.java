package com.example.hotel.service;

import java.util.List;

import com.example.hotel.dto.GuestRequestDto;

public interface GuestService {

	void addGuestDetails(List<GuestRequestDto> guestRequestDtoList, int bookingId);

}
