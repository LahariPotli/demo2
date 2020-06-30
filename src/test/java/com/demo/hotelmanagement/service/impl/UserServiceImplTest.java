package com.demo.hotelmanagement.service.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.demo.hotelmanagement.dao.UserDao;
import com.demo.hotelmanagement.dto.UserDto;
import com.demo.hotelmanagement.model.User;


@ExtendWith(MockitoExtension.class)
public class UserServiceImplTest {

	@Mock
	UserDao userDao;

	@InjectMocks
	UserServiceImpl userServiceImpl;

	UserDto userDto;

	@BeforeEach
	public void setUp() {

		userDto = new UserDto();
		userDto.setUserName("test");
		userDto.setPassword("test");
		userDto.setLocation("testLocation");
		userDto.setContactNumber("7364");
		userDto.setAddress("testAddress");

	}

	@Test
	public void saveUser() {
		// given
		when(userDao.save(any(User.class))).thenReturn(any(User.class));
		//when
		userServiceImpl.addUser(userDto);
		//then
		verify(userDao).save(any(User.class));
	}

	
	@Test	
	public void authenticateTest()  {
		User user = new User();
		user.setUserName("test");
		user.setPassword("test");
		user.setLocation("testLocation");
		user.setContactNumber("7364");
		user.setAddress("testAddress");
		when(userDao.findByUserNameAndPassword("test", "test")).thenReturn(user);
		userServiceImpl.authenticateUser("test", "test");
		verify(userDao).findByUserNameAndPassword("test", "test");
		assertEquals(true,userServiceImpl.authenticateUser("test", "test"));
		
	}
	
	
	@Test
	
	public void authenticateTest1()  {
		User user = new User();
		user.setUserName("manasa");
		user.setPassword("1234");
		user.setLocation("kadapa");
		user.setContactNumber("7364");
		user.setAddress("hush");
		when(userDao.findByUserNameAndPassword("test", "test")).thenReturn(null);
		userServiceImpl.authenticateUser("test", "test");
		verify(userDao).findByUserNameAndPassword("test", "test");
		assertEquals(false,userServiceImpl.authenticateUser("test", "test"));
		
	}
	
}
