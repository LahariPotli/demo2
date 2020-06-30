package com.abc.parkingslotbooking.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ParkingSlot {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	Long parkingSlotId;
	Long employeeId;
	LocalDate date;
	@Enumerated(EnumType.STRING)
	StatusOptions statusOptions;
	public Long getParkingSlotId() {
		return parkingSlotId;
	}
	public void setParkingSlotId(Long parkingSlotId) {
		this.parkingSlotId = parkingSlotId;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
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
	
}