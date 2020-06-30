package com.demo.hotelmanagement.service;


import com.demo.hotelmanagement.dto.UserDto;
import com.demo.hotelmanagement.exception.InvalidCredentialsException;

 

/**
 * @author Lahari,Haritha
 *
 */
public interface UserService {
 
    /**
     * 
     * This method is used to register User
     * @param userDto
     */
    public void addUser(UserDto userDto);

  /**
     * This method is used to authenticate User
     * 
     * @param loginDto
     * @return boolean true if an authenticated User else false
     * @throws InvalidCredentialsException 
     */
    public boolean authenticateUser(String userName, String password) ;
}