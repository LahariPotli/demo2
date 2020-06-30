package com.abc.parkingslotbooking.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Employee")
@XmlAccessorType(XmlAccessType.FIELD)
@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	Long employeeId;
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public EmployeeType getEmployeeType() {
		return employeeType;
	}
	public void setEmployeeType(EmployeeType employeeType) {
		this.employeeType = employeeType;
	}
	public Long getExperienceInYears() {
		return experienceInYears;
	}
	public void setExperienceInYears(Long experienceInYears) {
		this.experienceInYears = experienceInYears;
	}
	public Long getParkingSlotNumber() {
		return parkingSlotNumber;
	}
	public void setParkingSlotNumber(Long parkingSlotNumber) {
		this.parkingSlotNumber = parkingSlotNumber;
	}
	@NotNull
	@NotEmpty
	@Size(min = 3, max = 20, message = "username is required")
	String employeeName;
	@NotNull
	@NotEmpty
	@Size(max = 15, message = "password is required")
	String password;
	@Enumerated(EnumType.STRING)
	EmployeeType employeeType;
	@NotNull
	@NotEmpty
	@Size(max = 10, message = "experienceInYears should not be blank")
	Long experienceInYears;
	@NotNull
	@NotEmpty
	@Size(max = 20, message = "parkingSlotNumber should not be blank")
	Long parkingSlotNumber;
}
