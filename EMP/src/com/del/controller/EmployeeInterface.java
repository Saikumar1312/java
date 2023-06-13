package com.del.controller;

import java.io.IOException;

import com.del.Model.Employee;

public interface EmployeeInterface {
	public void addEmployee();
	public void viewEmployee();
	public void DeSerial() throws IOException;
	public void Serial() throws IOException;
	public void UpdateEmployee(Employee emp);
	public void DeleteEmployee();
}