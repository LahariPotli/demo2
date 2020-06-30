package com.abc.parkingslotbooking.dao;

import java.util.List;

import java.util.Optional;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.data.repository.CrudRepository;


import com.abc.parkingslotbooking.model.Requests;

public interface RequestsDao extends CrudRepository<Requests, Long>{
	 static Log logger = LogFactory.getLog(RequestsDao.class);
	/**This method is used to get all the requests by employeeId and requestid
	 * @param employeeId
	 * @param requestId
	 * @return requests by employeeId and REquestId
	 */
	public Optional<Requests> findByEmployeeIdAndRequestId(Long employeeId,Long requestId);
	/**This method is used to get list of requests by employeeId 
	 * @param employeeId
	 * @return list of requests by employeeId
	 */
	public Optional<List<Requests>> findByEmployeeId(Long employeeId);


}
