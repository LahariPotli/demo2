package com.abc.parkingslotbooking.dto;

import java.time.LocalDate;



import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.abc.parkingslotbooking.model.RequestType;
import com.abc.parkingslotbooking.model.StatusOptions;

public class ResponseDto {
	Long requestId;
	Long employeeId;
	@Enumerated(EnumType.STRING)
	RequestType requestType;
	LocalDate date;
	@Enumerated(EnumType.STRING)
	StatusOptions statusOptions;
	Long parkingSlotNumber;
	

	

	public Long getRequestId() {
		return requestId;
	}

	public void setRequestId(Long requestId) {
		this.requestId = requestId;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public RequestType getRequestType() {
		return requestType;
	}

	public void setRequestType(RequestType requestType) {
		this.requestType = requestType;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public StatusOptions getStatusOptions() {
		return statusOptions;
	}

	public void setStatusOptions(StatusOptions statusOptions) {
		this.statusOptions = statusOptions;
	}

	public Long getParkingSlotNumber() {
		return parkingSlotNumber;
	}

	public void setParkingSlotNumber(Long parkingSlotNumber) {
		this.parkingSlotNumber = parkingSlotNumber;
	}

}
