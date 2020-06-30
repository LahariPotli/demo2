package com.demo.hotelmanagement.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.hotelmanagement.model.Hotel;
@Repository
public interface HotelDao extends CrudRepository<Hotel, Long>{
	
	/**
	 * This method is used to get Hotel details by hotelId
	 * @param hotelId
	 * @return all hotels by hotel id
	 */
	Optional<Hotel> findByHotelId(Long hotelId);
	
	
	Optional<List<Hotel>> findByLocation(String location);

	/**
	 * This method is used to get hotelDetails by location
	 * @param location
	 * @return list of hotels by location
	 */
	Optional<List<Hotel>> findByLocationContains(String location);

	
	
	

}

