package com.demo.hotelmanagement.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.hotelmanagement.dao.HotelDao;
import com.demo.hotelmanagement.dao.RoomOptionsDao;
import com.demo.hotelmanagement.dto.HotelDetailsDto;
import com.demo.hotelmanagement.dto.HotelResponseDto;
import com.demo.hotelmanagement.dto.RoomOptionsDto;
import com.demo.hotelmanagement.model.Hotel;
import com.demo.hotelmanagement.model.RoomOptions;
import com.demo.hotelmanagement.service.HotelService;


@Service
public class HotelServiceImpl implements HotelService {

	@Autowired
	HotelDao hotelDao;

	@Autowired
	RoomOptionsDao roomOptionsDao;
	/**
     * {@inheritDoc}
     */
	@Override
	public HotelResponseDto getHotelsByLocation(String location, String availableDate) {
		HotelResponseDto hotelResponseDto = new HotelResponseDto();
		Optional<List<Hotel>> hotelList = hotelDao.findByLocationContains(location);

		if (!hotelList.isPresent())
			return hotelResponseDto;

		List<Long> hotelIdList = hotelList.get().stream().map(hotel -> hotel.getHotelId()).collect(Collectors.toList());
		
		List<HotelDetailsDto> hotelDetailsDtoList = hotelIdList.stream().map(id -> getHotelDetails(id, availableDate))
				.collect(Collectors.toList());

		hotelResponseDto.setHotelDetailsDtoList(hotelDetailsDtoList);
			return hotelResponseDto;

	}

	private HotelDetailsDto getHotelDetails(Long hotelId, String availableDate) {

		HotelDetailsDto hotelDetailsDto = new HotelDetailsDto();
		Optional<Hotel> hotel = hotelDao.findByHotelId(hotelId);
		if (!hotel.isPresent())
			return null;
		Optional<RoomOptions> roomOptions = roomOptionsDao.findByHotelIdAndAvailableDate(hotelId,
				LocalDate.parse(availableDate));
		if (!roomOptions.isPresent())
			return null;

		Optional<Hotel> hotel1 = hotelDao.findByHotelId(roomOptions.get().getHotelId());
		if (!hotel1.isPresent())
			return null;
		hotelDetailsDto.setAddress(hotel1.get().getAddress());
		hotelDetailsDto.setContactNumber(hotel1.get().getContactNumber());
		hotelDetailsDto.setDoubleRoom(roomOptions.get().getDoubleRoom());
		hotelDetailsDto.setFamilyRoom(roomOptions.get().getFamilyRoom());
		hotelDetailsDto.setHotelName(hotel1.get().getHotelName());
		hotelDetailsDto.setRoomsAvailable(hotel1.get().getRoomsAvailable());
		hotelDetailsDto.setSingleRoom(roomOptions.get().getSingleRoom());
		hotelDetailsDto.setTripleRoom(roomOptions.get().getTripleRoom());
		hotelDetailsDto.setVilla(roomOptions.get().getVilla());
		hotelDetailsDto.setHotelId(hotel1.get().getHotelId());
		hotelDetailsDto.setLocation(hotel1.get().getLocation());
		return hotelDetailsDto;

	}

	@Override
    public List<RoomOptionsDto> getAllRoomOptionsByHotelId(Long hotelId) {
        Optional<RoomOptions> rooms = roomOptionsDao.findByHotelId(hotelId);
        List<RoomOptionsDto> roomOptionsList = new ArrayList<>();
        if (rooms.isPresent()) {
            return rooms.get().stream().map(room -> getRoomOptionsDto(room)).collect(Collectors.toList());
        }
        return roomOptionsList;
    }

 

    private RoomOptionsDto getRoomOptionsDto(RoomOptions roomOptions) {
    	RoomOptionsDto roomOptionsDto = new RoomOptionsDto();
        BeanUtils.copyProperties(roomOptions, roomOptionsDto);
        return roomOptionsDto;

 

    }
}
