package com.del.Model;

import java.io.Serializable;
import java.util.List;

public class Employee implements Serializable{
	private int empno;
	private String ename;
	
//	public Employee(List<Employee> emplist) {
//		super();
//		System.out.println("List Working");
//		this.empno=empno;
//		this.ename=ename;
//		// TODO Auto-generated constructor stub
//	}
	
	
	public Employee(int empno, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
	}


	


	public Employee(Employee emp) {
		super();
		this.empno=emp.empno;
		this.ename=emp.ename;
		// TODO Auto-generated constructor stub
	}


	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", ename=" + ename + "]";
	}
	

}
