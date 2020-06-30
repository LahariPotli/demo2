package com.abc.parkingslotbooking.dto;

import java.time.LocalDate;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.abc.parkingslotbooking.model.RequestType;
import com.abc.parkingslotbooking.model.StatusOptions;

public class RequestResponseDto {
	@SuppressWarnings("unused")
	private static Log logger = LogFactory.getLog(RequestResponseDto.class);
	@Enumerated(EnumType.STRING)
	RequestType requestType;
	LocalDate date;
	@Enumerated(EnumType.STRING)
	StatusOptions statusOptions;
	Long parkingSlotNumber;
	private String message;
	Integer statusCode;

	public Integer getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public RequestResponseDto() {
		super();
	}

	public RequestResponseDto(String message) {
		super();
		this.message = message;
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
