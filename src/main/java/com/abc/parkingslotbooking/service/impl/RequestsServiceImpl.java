package com.abc.parkingslotbooking.service.impl;

import java.util.ArrayList;



import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.abc.parkingslotbooking.dao.RequestsDao;
import com.abc.parkingslotbooking.dto.RequestResponseDto;
import com.abc.parkingslotbooking.dto.ResponseDto;
import com.abc.parkingslotbooking.model.Requests;
import com.abc.parkingslotbooking.service.RequestsService;

@Service
public class RequestsServiceImpl implements RequestsService {
	private static Log logger = LogFactory.getLog(RequestsServiceImpl.class);
	@Autowired
	RequestsDao requestDao;

	/**This method is used to get all the requests by employeeId and requestid
	 * @{inherit Doc}
	 */
	@Override
	public RequestResponseDto getrequestsbyEmployeeIdAndRequestId(Long employeeId, Long requestId) {
		logger.info("Inside getrequestsbyEmployeeIdAndRequestId requestserviceimpl ");
		Optional<Requests> requestOptional = requestDao.findByEmployeeIdAndRequestId(employeeId, requestId);
		RequestResponseDto requestResponseDto = new RequestResponseDto();
		if (requestOptional.isPresent()) {
			BeanUtils.copyProperties(requestOptional.get(), requestResponseDto);
			requestResponseDto.setMessage("Please find your details");
			requestResponseDto.setStatusCode(200);
			return requestResponseDto;
		}
		requestResponseDto.setMessage("Please VERIFY YOUR EMPLOYEE ID AND REQUEST ID");
		requestResponseDto.setStatusCode(400);

		return requestResponseDto;
	}

	/**This method is used to get list of requests by employeeId 
	 *@{inherit Doc}
	 */
	@Override
	public List<ResponseDto> getrequestsByEmployeeId(Long employeeId) {
		logger.info("Inside getrequestsByEmployeeId requestserviceimpl ");

		List<ResponseDto> responseList = new ArrayList<ResponseDto>();

		Optional<List<Requests>> requestsOptional = requestDao.findByEmployeeId(employeeId);

		if (requestsOptional.isPresent())

			return requestsOptional.get().stream().map(request -> getResponseDto(request)).collect(Collectors.toList());

		else {
			return responseList;
		}
	}

	private ResponseDto getResponseDto(Requests request) {
		ResponseDto responseDto = new ResponseDto();
		BeanUtils.copyProperties(request, responseDto);

		return responseDto;
	}
}
