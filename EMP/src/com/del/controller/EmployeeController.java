package com.del.controller;

import java.util.ArrayList;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;

import com.del.Model.Employee;

public class EmployeeController implements EmployeeInterface,Serializable{
	
	private transient Scanner sc = new Scanner(System.in);
	Employee emp;
	List emplist = new ArrayList<>(); 
	public void addEmployee()
	{		
		emp = new Employee();
		System.out.println("Enter EMPno");
		int eno =sc.nextInt();
		emp.setEmpno(eno);
		
		System.out.println("Enter EMPname");
		String ename =sc.next();
		emp.setEname(ename);
		emplist.add(emp);
		System.out.println("Employee Added Successfully");
		
	}
	
	public void viewEmployee() {
		//System.out.println(emp.getEmpno());
		//System.out.println(emp.getEname());
		
		//System.out.println(emplist);
		
		Iterator<Employee> i = emplist.iterator();
		while(i.hasNext()){
		System.out.println(i.next());
		}
	}

	@Override
	public void DeSerial() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Serial() throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DeleteEmployee() {
		// TODO Auto-generated method stub
		
	}

}