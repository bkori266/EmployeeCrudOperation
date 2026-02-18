package com.cg.EmployeeCrudOperation.DAO;

import java.util.List;
import java.util.Optional;

import com.cg.EmployeeCrudOperation.domain.Employee;

public interface EmployeeDAO {
	
	public List<Employee> getAll();
	
	public Optional<Employee> getById(int id);
	
	public void saveOrUpdate(Employee emp);
	
	public void deleteById(int id);
	
}
