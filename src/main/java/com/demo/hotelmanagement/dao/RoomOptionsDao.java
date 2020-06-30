package com.demo.hotelmanagement.dao;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.hotelmanagement.model.RoomOptions;
@Repository
public interface RoomOptionsDao extends CrudRepository<RoomOptions, Long>{
	
	/**
	 * this method is used to get the Room details by using HotelId
	 * @param roomId
	 * @return rooms
	 */
	Optional<RoomOptions> findByHotelId(Long hotelId);
	/**
	 * this method is used to get the Room details by using RoomId
	 * @param hotelId
	 * @return hotel Room details
	 */
	Optional<RoomOptions> findByRoomOptionId(Long roomId);

	/**
	 * this method is used to get Room details by hotelId and available date 
	 * @param roomId
	 * @return roomoptions based on guests
	 */
	Optional<RoomOptions> findByHotelIdAndAvailableDate(Long hotelId, LocalDate availableDate);

	
	
	
	
	
	

}
