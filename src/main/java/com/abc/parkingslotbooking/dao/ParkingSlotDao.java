package com.abc.parkingslotbooking.dao;



import org.springframework.data.repository.CrudRepository;


import com.abc.parkingslotbooking.model.Requests;



public interface ParkingSlotDao extends CrudRepository<Requests, Long>  {
	
}
