package com.cg.EmployeeCrudOperation.domain;

public class Employee {
	
	
	private int id;
	private String name;
	private String course;
	private long fees;	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public long getFees() {
		return fees;
	}
	public void setFees(int i) {
		this.fees = i;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", course=" + course + ", fees=" + fees + "]";
	}

}
