package com.demo.hotelmanagement.dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.demo.hotelmanagement.model.User;
@Repository
public interface UserDao extends CrudRepository<User, Long> {
	
	
	 /**
     * This method is used to get User by userId
     * 
     * @param userId
     * @return
     */
	Optional<User> findByUserId(Long userId);
	
	 /**
     * This method is used to authenticate User
     * @param userName
     * @param password
     * @return
     */
    public User findByUserNameAndPassword(String userName, String password);

}

