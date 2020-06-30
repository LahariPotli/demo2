package com.example.hotel.service;

import com.example.hotel.dto.UserDto;
import com.example.hotel.exception.InvalidCredentialsException;

public interface UserService {

	/**
	 * 
	 * This method is used to register User
	 * @param userDto
	 */
	public void addUser(UserDto userDto);

	/**
	 * This method is used to authenticate User
	 * @param loginDto
	 * @return boolean true if an authenticated User else false
	 * @throws InvalidCredentialsException 
	 */
	public boolean authenticateUser(String userName, String password) throws InvalidCredentialsException;
}
