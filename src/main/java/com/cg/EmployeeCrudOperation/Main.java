package com.cg.EmployeeCrudOperation;

import java.util.ArrayList;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cg.EmployeeCrudOperation.domain.Employee;

public class Main {
	
	
	private Employee emp;
	Scanner sc;
	public Main() {
		emp=new Employee();
		sc=new Scanner(System.in);
	}

	public static void main(String[] args) {
		new Main().start();

	}
	
	public void saveOrUpdate() {
		
		System.out.println("Enter id: ");
		emp.setId(sc.nextInt());
		
		System.out.println("Enter name: ");
		emp.setName(sc.next());
		
		System.out.println("Enter Course: ");
		emp.setCourse(sc.next());
		
		System.out.println("Enter fees: ");
		emp.setFees(sc.nextInt());
		
		Configuration cf=new Configuration();
		SessionFactory sf=cf.buildSessionFactory();
		Session session=sf.openSession();
		
		session.persist(emp);

	}

	 public void start() {
	    	Scanner sc=new Scanner(System.in);
	        System.out.println("Hello World!");
	        int choice=1;int operation;
	        do
		    {	System.out.println("1 for Add Employee");
		        System.out.println("2 for View all Employee");
		        operation=sc.nextInt();
		        if(operation==1) {
		        	saveOrUpdate();
		        }
		        
		        else if (operation==2) {}
		        	        
		        else {System.out.println("Plz select correct option");}
		        System.out.println("Want to continue press 1");
		        choice=sc.nextInt();
	        	
	        }while(choice==1);
	 }
	 
}
