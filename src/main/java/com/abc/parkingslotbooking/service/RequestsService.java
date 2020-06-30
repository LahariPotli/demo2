package com.abc.parkingslotbooking.service;

import java.util.List;



import org.apache.commons.logging.Log;

import org.apache.commons.logging.LogFactory;


import com.abc.parkingslotbooking.dto.RequestResponseDto;
import com.abc.parkingslotbooking.dto.ResponseDto;


public interface RequestsService {
	 static Log logger = LogFactory.getLog(RequestsService.class);
	/**This method is used to get all the requests by employeeId and requestid
	 * @param employeeId
	 * @param requestId
	 * @return requests by employeeId and requestId
	 */
	RequestResponseDto getrequestsbyEmployeeIdAndRequestId(Long employeeId,Long requestId);
	/**This method is used to get list of requests by employeeId 
	 * @param employeeId
	 * @return list of requests by EmployeeID
	 */
	public List<ResponseDto> getrequestsByEmployeeId(Long employeeId);
}
