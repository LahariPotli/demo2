/*package com.abc.parkingslotbooking.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.abc.parkingslotbooking.dto.LoginDto;
import com.abc.parkingslotbooking.dto.LoginResponseDto;
import com.abc.parkingslotbooking.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@PostMapping("/employees/login")
	public ResponseEntity<LoginResponseDto> employeeLogin(@Valid @RequestBody LoginDto loginDto)
	{
		return new ResponseEntity<>(employeeService.loginEmployee(loginDto),HttpStatus.OK);
		
	}
	
	
	

}*/
