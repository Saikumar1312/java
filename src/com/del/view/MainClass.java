package com.del.view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.del.controller.EmployeeController;
import com.del.controller.EmployeeInterface;

public class MainClass {

	public static void main(String[] args) {
		try {
			String un = null;
			String pwd = null;

			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter Username");
			un = br.readLine();
			System.out.println("Enter Password");
			pwd = br.readLine();

			if (un.equals("sai") && pwd.equals("sai")) {
				System.out.println("Welcome " + un);

			} else {
				throw new UserNotFoundException();
			}

			System.out.println("Welcome to EMS :)");
			EmployeeInterface ec = new EmployeeController();
			EmployeeController es= new EmployeeController();
//			Employee em = new Employee();
			Scanner sc = new Scanner(System.in);
			String ch = null;
			do {
				System.out.println("Enter your choice");
				System.out.println("1. Add Employee");
				System.out.println("2. View Employee");
				System.out.println("3. Serial Employee");
				System.out.println("4. DeSerial Employee");
				int choice = sc.nextInt();
				switch (choice) {
				case 1: {
					ec.addEmployee();
					break;
				}

				case 2: {
					ec.viewEmployee();
					break;
				}
				
				case 3: {
					ec.Serial();
					break;
				}
				
				case 4: {
					ec.DeSerial();
					break;
				}

				default: {
					System.out.println("Enter a valid number");
					break;
				}
				}

				System.out.println("Do u want to continue Y | y");
				ch = sc.next();

			} while (ch.equals("Y") || ch.equals("y"));
			System.out.println("Thanks for using our system.");
			System.exit(0);

		} catch (Exception ae) {
			System.out.println("User And Pass Not Correct");
			ae.printStackTrace();
		}
	}

}