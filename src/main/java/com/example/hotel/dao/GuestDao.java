package com.example.hotel.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.hotel.model.GuestDetails;

@Repository
public interface GuestDao extends CrudRepository<GuestDetails, Integer> {

}
