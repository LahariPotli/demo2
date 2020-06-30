package com.abc.parkingslotbooking.controller;

import java.util.List;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RestController;

import com.abc.parkingslotbooking.dto.RequestResponseDto;
import com.abc.parkingslotbooking.dto.ResponseDto;
import com.abc.parkingslotbooking.service.RequestsService;





@RestController
public class RequestsController {
	private static Log logger = LogFactory.getLog(RequestsController.class);
	@Autowired
	RequestsService requestsService;
	/**This method is used to get all the requests by employeeId and requestid
	 * @param employeeId
	 * @param requestId
	 * @return requests by employeeId and requestId
	 */
	@GetMapping("/employees/{employeeId}/requests/{requestId}")
	public ResponseEntity<RequestResponseDto> getrequestsbyEmployeeIdAndRequestId(@PathVariable("employeeId") Long employeeId,@PathVariable("requestId") Long requestId)
	{
		logger.info("Inside getrequestsbyEmployeeIdAndRequestId request controller ");
		return new ResponseEntity<>(requestsService.getrequestsbyEmployeeIdAndRequestId(employeeId,requestId),HttpStatus.OK);
		
	}
	/**This method is used to get list of requests by employeeId 
	 * @param employeeId
	 * @return list of requests by employeeId
	 */
	/*@GetMapping("/employees/{employeeId}")
	public ResponseEntity<List<ResponseDto>> getrequestsbyEmployeeId(@PathVariable("employeeId") Long employeeId)
	{
		logger.info("Inside getrequestsbyEmployeeIdAndRequestId request controller ");
		return new ResponseEntity<List<ResponseDto>>(requestsService.getrequestsByEmployeeId(employeeId),HttpStatus.OK);
		
	}*/

}
