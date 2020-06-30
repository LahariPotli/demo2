package com.demo.hotelmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.demo.hotelmanagement.dto.LoginDto;
import com.demo.hotelmanagement.dto.UserDto;
import com.demo.hotelmanagement.exception.ResourceNotFoundException;
import com.demo.hotelmanagement.service.UserService;

 

 

@RestController
public class UserController {
	private static Log logger = LogFactory.getLog(UserController.class);
    @Autowired
    UserService userService;

 
	/**
	 * @param userDto
	 * @return user added successfully
	 */
    
    @PostMapping(value = "/users")
    public String registerUser(@Valid @RequestBody UserDto userDto) {
    	logger.info("Inside addinguser controller");
        userService.addUser(userDto);
        return "user added successfully";
    }

 
    /**
     * This method is used to authenticate user
	 * @param loginDto
	 * @return logged in successfully
	 */
    @PostMapping("/users/login")
    public ResponseEntity<String> authenticateUser(@Valid @RequestBody LoginDto loginDto)  {
    	logger.info("Inside login api");
       boolean  isExists=userService.authenticateUser(loginDto.getUserName(),loginDto.getPassword());
        if (isExists)
            return new ResponseEntity<>("logged in successfully",HttpStatus.OK);
        else {
            throw new ResourceNotFoundException("Please enter valid credentials");
        }
    }
    @ResponseStatus(HttpStatus.BAD_REQUEST)

    @ExceptionHandler(MethodArgumentNotValidException.class)

    public Map<String, String> handleValidationExceptions(

      MethodArgumentNotValidException ex) {

        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach((error) -> {

            String fieldName = ((FieldError) error).getField();

            String errorMessage = error.getDefaultMessage();

            errors.put(fieldName, errorMessage);

        });

        return errors;

    }
}