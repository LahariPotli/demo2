package com.abc.parkingslotbooking.controller;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.stubbing.OngoingStubbing;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.abc.parkingslotbooking.dto.RequestResponseDto;
import com.abc.parkingslotbooking.dto.ResponseDto;
import com.abc.parkingslotbooking.model.RequestType;
import com.abc.parkingslotbooking.model.Requests;
import com.abc.parkingslotbooking.model.StatusOptions;
import com.abc.parkingslotbooking.service.RequestsService;
import com.fasterxml.jackson.databind.ObjectMapper;

@ExtendWith(MockitoExtension.class)

public class RequestsControllerTest {

	@Mock
	RequestsService requestsService;

	MockMvc mockMvc;
	ObjectMapper objectMapper;

	@InjectMocks
	RequestsController requestController;

	RequestResponseDto requestResponseDto;
	List<ResponseDto> responseDtolist;

	ResponseDto responseDto;

	@BeforeEach
	public void setUp() {
		objectMapper = new ObjectMapper();
		mockMvc = MockMvcBuilders.standaloneSetup(requestController).build();

	}

	@SuppressWarnings("unchecked")
	@Test
	public void getrequestsbyEmployeeIdAndRequestId () throws Exception {
		RequestResponseDto requestResponseDto=new RequestResponseDto();

		requestResponseDto = new RequestResponseDto();
		requestResponseDto.setDate(LocalDate.parse("2020-06-30"));
		requestResponseDto.setMessage("your details are here");
		requestResponseDto.setParkingSlotNumber(4567L);
		requestResponseDto.setStatusCode(200);
		requestResponseDto.setStatusOptions(StatusOptions.AVAILABLE);
		requestResponseDto.setRequestType(RequestType.RELEASE);
		
		
		/*when(requestsService.getrequestsbyEmployeeIdAndRequestId(1L, 1L)).thenReturn(requestResponseDto);
		mockMvc.perform( ( get("/employees/{employeeId}/requests/{requestId}",1L,1L))
				.andExpect(status().isOk())
				.andExpect(jsonPath("$", Matchers.any(LinkedHashMap.class))));
				
				verify(requestsService).getrequestsbyEmployeeIdAndRequestId(1L, 1L);
	}*/
		
	Mockito.when(
			requestsService.getrequestsbyEmployeeIdAndRequestId(Mockito.anyLong(),
					Mockito.anyLong())).thenReturn(requestResponseDto);

	RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
			"/employees/{employeeId1}/requests/{requestId1}").accept(
			MediaType.APPLICATION_JSON);

	MvcResult result = mockMvc.perform(requestBuilder).andReturn();

	System.out.println(result.getResponse());
	String expected = "{request_id=1,date:2020-06-30,employee_id:1,parking_slot_number:4567,request_type:REQUEST,status_options:AVAILABLE}";

	// {"id":"Course1","name":"Spring","description":"10 Steps, 25 Examples and 10K Students","steps":["Learn Maven","Import Project","First Example","Second Example"]}

	JSONAssert.assertEquals(expected, result.getResponse()
			.getContentAsString(), false);
	}
}


