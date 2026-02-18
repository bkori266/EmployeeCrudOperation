package com.cg.EmployeeCrudOperation.serviceImpl;

import java.util.List;
import java.util.Optional;

import com.cg.EmployeeCrudOperation.DAO.EmployeeDAO;
import com.cg.EmployeeCrudOperation.DAOImpl.EmployeeDAOImpl;
import com.cg.EmployeeCrudOperation.domain.Employee;
import com.cg.EmployeeCrudOperation.service.EmployeService;

public class EmployeeServiceImpl implements EmployeService {
	
	private EmployeeDAO employeeDAO;
	
	public EmployeeServiceImpl() {
		employeeDAO= new EmployeeDAOImpl();
	}

	@Override
	public Optional<Employee> getById(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void saveOrUpdate(Employee emp) {
		employeeDAO.saveOrUpdate(emp);
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Employee> getAll() {
		
		return employeeDAO.getAll();
	}

}
