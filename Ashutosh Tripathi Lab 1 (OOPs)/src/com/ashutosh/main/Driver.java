package com.ashutosh.main;

import java.util.Scanner;

import com.ashutosh.model.Employee;
import com.ashutosh.service.CredentialService;

public class Driver {

	public static void main(String[] args) {
		
		int choice;
		String generatedEmail;
		char[] generatedPassword;
		
		Scanner sc = new Scanner(System.in);
		
		Employee empObj = new Employee("Ashutosh", "Tripathi");
		CredentialService csObj = new CredentialService();
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		choice = sc.nextInt();
		
		switch(choice) {
		
		case 1:
			generatedEmail = csObj.generateEmailAddress(empObj.getFirstName(), empObj.getLastName(), "tech");
			generatedPassword = csObj.generatePassword();
			csObj.showCredentials(empObj, generatedEmail, generatedPassword);
			break;
			
		case 2:
			generatedEmail = csObj.generateEmailAddress(empObj.getFirstName(), empObj.getLastName(), "admin");
			generatedPassword = csObj.generatePassword();
			csObj.showCredentials(empObj, generatedEmail, generatedPassword);
			break;
			
		case 3:
			generatedEmail = csObj.generateEmailAddress(empObj.getFirstName(), empObj.getLastName(), "hr");
			generatedPassword = csObj.generatePassword();
			csObj.showCredentials(empObj, generatedEmail, generatedPassword);
			break;
			
		case 4:
			generatedEmail = csObj.generateEmailAddress(empObj.getFirstName(), empObj.getLastName(), "legal");
			generatedPassword = csObj.generatePassword();
			csObj.showCredentials(empObj, generatedEmail, generatedPassword);
			break;
			
		default:
			System.out.println("Invalid Input");
		
		} //end of switch
		
		sc.close();
		
	}

}
