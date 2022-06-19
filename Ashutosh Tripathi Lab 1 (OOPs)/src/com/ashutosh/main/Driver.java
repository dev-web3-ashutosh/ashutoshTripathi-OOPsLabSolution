package com.ashutosh.main;

import java.util.Scanner;

import com.ashutosh.model.Employee;

public class Driver {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int choice;
		
		Employee empObj = new Employee("ashutosh", "tripathi");
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			//tech
			break;
			
		case 2:
			//admin
			break;
			
		case 3:
			//hr
			break;
			
		case 4:
			//legal
			break;
			
		default:
			System.out.println("Invalid Input");
		
		} //end of switch
		
		sc.close();
		
	}

}
