package com.abc.parkingslotbooking.service;

import javax.validation.Valid;

import com.abc.parkingslotbooking.dto.LoginDto;
import com.abc.parkingslotbooking.dto.LoginResponseDto;

public interface EmployeeService {

	LoginResponseDto loginEmployee(@Valid LoginDto loginDto);

}
