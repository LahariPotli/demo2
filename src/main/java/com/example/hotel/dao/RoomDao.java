package com.example.hotel.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.hotel.model.RoomDetails;

@Repository
public interface RoomDao extends CrudRepository<RoomDetails, Integer> {

	List<RoomDetails> findRoomDetailsByHotelId(int hotelId);

	Optional<List<RoomDetails>> findAllByHotelId(int hotelId);

}
