package com.demo.hotelmanagement.service.impl;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.hotelmanagement.dao.UserDao;
import com.demo.hotelmanagement.dto.UserDto;
import com.demo.hotelmanagement.exception.InvalidCredentialsException;
import com.demo.hotelmanagement.model.User;
import com.demo.hotelmanagement.service.UserService;

 

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    /**
     * {@inheritDoc}
     */
    @Override
    public void addUser(@RequestBody UserDto userDto) {
        User user = new User();
        BeanUtils.copyProperties(userDto, user);
        userDao.save(user);
    }


    /**
     * {@inheritDoc}
     * @throws InvalidCredentialsException 
     */
    @Override
    public boolean authenticateUser(String userName, String password)  {
      
        if (userDao.findByUserNameAndPassword(userName,password)!= null)
            return true;
        return false;
    }

 

}