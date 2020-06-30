package com.abc.parkingslotbooking.dao;

import org.springframework.data.repository.CrudRepository;

import com.abc.parkingslotbooking.model.Employee;

public interface EmployeeDao extends CrudRepository<Employee, Long>{

}
