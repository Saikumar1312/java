package com.del.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.del.Model.Employee;

public class EmployeeController implements EmployeeInterface {

	Scanner sc = new Scanner(System.in);
	Employee emp;
	List<Employee> emplist = new ArrayList<>();

	public void addEmployee() {
		emp = new Employee();
		System.out.println("Enter Eno");
		int eno = sc.nextInt();
		emp.setEmpno(eno);

		System.out.println("Enter Ename");
		String ename = sc.next();
		emp.setEname(ename);
		emplist.add(emp);
		System.out.println("Employee Added Successfully");

	}

	public void viewEmployee() {
		System.out.println(emplist);
		System.out.println("After Iterator ---");
		Iterator<Employee> i = emplist.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		emplist.forEach(e -> System.out.println(e));
	}




	public  void Serial() throws IOException
	{
		try{
//		Employee emp1 = new Employee(emplist);
	
		FileOutputStream fos = new FileOutputStream("Sai11.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(emplist);
		System.out.println("Serilized to file dedalus.txt");
		oos.close();
		fos.close();
		}
		catch(FileNotFoundException fnf)
		{
			System.out.println("No file");
		}
	}

 
 
 	public void DeSerial() throws IOException
 	{
 		try{
 		
 	
 		FileInputStream fis = new FileInputStream("Sai11.txt");
 		ObjectInputStream ois = new ObjectInputStream(fis);
 		emplist = (ArrayList<Employee>) ois.readObject();
		System.out.println("DeSerilized from file dedalus.txt");
		for (Employee emp : emplist) {
			System.out.println(emp.getEmpno() + " " + emp.getEname());
		}
 		
// 		Employee emp = (Employee)ois.readObject();
// 		System.out.println("DeSerilized from file dedalus.txt");
// 		System.out.println(emp.getEmpno());
// 		System.out.println(emp.getEname());
 		ois.close();
 		fis.close();
 		}
 		catch(FileNotFoundException fnf)
 		{
 			System.out.println("No file");
 		}
 		catch(ClassNotFoundException cnf)
 		{
 			System.out.println("No Emp class");
 		}

 	}
 
}