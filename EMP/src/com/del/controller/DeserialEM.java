//package com.del.controller;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.ObjectInputStream;
//
//import com.del.Model.Employee;
//
//public class DeserialEM {
//	public void DeSerial() throws IOException
//	{
//		try{
//		
//	
//		FileInputStream fis = new FileInputStream("Sai11.txt");
//		ObjectInputStream ois = new ObjectInputStream(fis);
//		
//		Employee emp = (Employee)ois.readObject();
//		System.out.println("DeSerilized from file dedalus.txt");
//		System.out.println(emp.getEmpno());
//		System.out.println(emp.getEname());
//		ois.close();
//		fis.close();
//		}
//		catch(FileNotFoundException fnf)
//		{
//			System.out.println("No file");
//		}
//		catch(ClassNotFoundException cnf)
//		{
//			System.out.println("No Emp class");
//		}
//
//	}
//
//}
