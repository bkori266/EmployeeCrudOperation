package com.cg.EmployeeCrudOperation.service;

import java.util.List;
import java.util.Optional;

import com.cg.EmployeeCrudOperation.domain.Employee;

public interface EmployeService {
	
	public Optional<Employee> getById(int id);
	
	public void saveOrUpdate(Employee emp);
	
	public void deleteById(int i);
	
	public List<Employee> getAll();
	
	

}
