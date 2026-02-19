package com.cg.EmployeeCrudOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.cg.EmployeeCrudOperation.controller.EmployeeController;
import com.cg.EmployeeCrudOperation.domain.Employee;

/**
 * Hello world!
 */
public class App {
	List<Employee> emp;
	EmployeeController empController;
	
	public App() {
		empController=new EmployeeController();
		
	}

    public static void main(String[] args) {
    	
    	  App a=new App();
    		  a.start();	  
    }
    
    public void display() {
    	System.out.println("Inside display");
    	for(Employee e:emp) {
    		System.out.println("EMployee"+e);
    	}
    }
    
    
    public void start() {
    	emp=new ArrayList<>();
    	Scanner sc=new Scanner(System.in);
        System.out.println("Hello World!");
        int choice=1;int operation;
        do
        {System.out.println("1 for Add");
        System.out.println("2 for View all");
        System.out.println("3 for DeletebyId");
        operation=sc.nextInt();
        if(operation==1) {
        	empController.saveOrUpdate();
        }
        
        else if (operation==2) {
        	emp=empController.getAll();
        	display();
        	
        	
        }
        
        else {System.out.println("Inside else block");}
        System.out.println("Want to continue press 1");
        choice=sc.nextInt();
        	
        }while(choice==1);
        
    }
}
