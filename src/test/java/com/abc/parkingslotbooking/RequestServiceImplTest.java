package com.abc.parkingslotbooking;

import static org.mockito.Mockito.verify;


import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.abc.parkingslotbooking.dao.RequestsDao;
import com.abc.parkingslotbooking.dto.RequestResponseDto;
import com.abc.parkingslotbooking.dto.ResponseDto;
import com.abc.parkingslotbooking.model.RequestType;
import com.abc.parkingslotbooking.model.StatusOptions;
import com.abc.parkingslotbooking.service.impl.RequestsServiceImpl;

@ExtendWith(MockitoExtension.class)
public class RequestServiceImplTest {

	@Mock
	RequestsDao requestsDao;

	@InjectMocks
	RequestsServiceImpl requestsServiceImpl;
	

	@BeforeEach
	public void setUp() {

	}

	@Test
	public void getrequestsByEmployeeIdAndREquestId() {
		RequestResponseDto requestResponseDto = new RequestResponseDto();
		requestResponseDto.setDate(LocalDate.parse("2020-06-30"));
		requestResponseDto.setMessage("your details are here");
		requestResponseDto.setParkingSlotNumber(4567L);
		requestResponseDto.setStatusCode(200);
		requestResponseDto.setStatusOptions(StatusOptions.AVAILABLE);
		requestResponseDto.setRequestType(RequestType.RELEASE);
		requestsServiceImpl.getrequestsbyEmployeeIdAndRequestId(1L, 1L);
		verify(requestsDao).findByEmployeeIdAndRequestId(1L,1L);

	}

	@Test
	public void getrequestsByEmployeeId() {
		ResponseDto responseDto = new ResponseDto();
		List<ResponseDto> responseDtolist = new ArrayList<>();
		responseDtolist.add(responseDto);
		responseDto.setDate(LocalDate.parse("2020-06-30"));
		
		responseDto.setParkingSlotNumber(4567L);
		
		responseDto.setStatusOptions(StatusOptions.AVAILABLE);
		responseDto.setRequestType(RequestType.RELEASE);
		responseDto.setEmployeeId(1L);
		responseDto.setRequestId(1L);
		requestsServiceImpl.getrequestsByEmployeeId(1L);
		verify(requestsDao).findByEmployeeId(1L);
		
		
		
	}
}



