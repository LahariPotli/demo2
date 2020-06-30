package com.example.hotel.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.hotel.model.HotelDetails;

@Repository
public interface HotelDao extends CrudRepository<HotelDetails, Integer> {

	Optional<HotelDetails> findHotelDetailsByHotelId(int hotelId);

	Optional<List<HotelDetails>> findHotelDetailsByLocation(String location);

}
