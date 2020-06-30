package com.demo.hotelmanagement.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.hotelmanagement.model.Booking;
@Repository
public interface BookingDao extends CrudRepository<Booking, Long>{

}
