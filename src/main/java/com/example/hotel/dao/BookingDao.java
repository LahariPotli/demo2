package com.example.hotel.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.hotel.model.BookingDetails;

@Repository
public interface BookingDao extends CrudRepository<BookingDetails, Integer> {

	Optional<BookingDetails> findAllByRoomId(int roomId);

}
