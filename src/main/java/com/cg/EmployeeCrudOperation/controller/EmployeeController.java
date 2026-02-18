package com.cg.EmployeeCrudOperation.controller;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import com.cg.EmployeeCrudOperation.domain.Employee;
import com.cg.EmployeeCrudOperation.service.EmployeService;
import com.cg.EmployeeCrudOperation.serviceImpl.EmployeeServiceImpl;

public class EmployeeController {
	private Employee emp;
	private EmployeService serviceEmployee;
	Scanner sc;
	
	public EmployeeController() {
		emp=new Employee();
		serviceEmployee=new EmployeeServiceImpl();
		sc=new Scanner(System.in);
	}
	
	public Optional<Employee> getById(Double id) {
		
		return Optional.empty();
	}

	
	public void saveOrUpdate() {
		System.out.println("Enter name: ");
		emp.setName(sc.next());
		System.out.println("Enter Course: ");
		emp.setCourse(sc.next());
		System.out.println("Enter fees: ");
		emp.setFees(sc.nextInt());
		
		serviceEmployee.saveOrUpdate(emp);

	}

	
	public void deleteById(int id) {
		System.out.println("Enter id: ");
		serviceEmployee.deleteById(sc.nextInt(id));
	}


	public List<Employee> getAll() {
		
		return serviceEmployee.getAll();
	}

}
