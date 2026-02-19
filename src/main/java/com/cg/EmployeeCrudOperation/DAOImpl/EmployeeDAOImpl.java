package com.cg.EmployeeCrudOperation.DAOImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import com.cg.EmployeeCrudOperation.DAO.EmployeeDAO;
import com.cg.EmployeeCrudOperation.domain.Employee;
import com.cg.EmployeeCrudOperation.exception.EmployeeNotFoundException;


public class EmployeeDAOImpl implements EmployeeDAO {

	private List<Employee> employees;
	
	public EmployeeDAOImpl() {
		employees=new ArrayList<>();
	}

	@Override
	public Optional<Employee> getById(int id) {
		return employees.stream().filter(a->a.getId()==id).findFirst();
	}

	@Override
	public void saveOrUpdate(Employee emp) {
		employees.add(emp);

	}

	@Override
	public void deleteById(int id) {
		employees.removeIf(a->a.getId()==id);
		
	}

	@Override
	public List<Employee> getAll() {
		
		return employees;
	}

}
