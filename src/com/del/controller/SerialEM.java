//package com.del.controller;
//
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.io.ObjectOutputStream;
//import com.del.Model.Employee;
//
//public class SerialEM extends Employee {
//	public void Serial() throws IOException
//	{
//		try{
//			System.out.println(new Employee().getEmpno()+"  "+new Employee().getEname()+"");
//		Employee emp = new Employee(new Employee().getEmpno(),new Employee().getEname());
//	
//		FileOutputStream fos = new FileOutputStream("Sai11.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		
//		oos.writeObject(emp);
//		System.out.println("Serilized to file dedalus.txt");
//		oos.close();
//		fos.close();
//		}
//		catch(FileNotFoundException fnf)
//		{
//			System.out.println("No file");
//		}
//	}
//
//}
