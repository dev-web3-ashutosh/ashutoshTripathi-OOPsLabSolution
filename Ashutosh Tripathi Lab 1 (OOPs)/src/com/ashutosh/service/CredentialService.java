package com.ashutosh.service;

import com.ashutosh.model.Employee;

public class CredentialService {
	
	public char[] generatePassword() {
		
		char[] pwd;
		
		return pwd;
	}
	
	public String generateEmailAddress(String firstName, String lastName, String department) {
		
		String company = "google";
		String email = "";
		email = firstName + lastName + "@" + department + "." + company + ".com";
		return email;
	}
	
	public void showCredentials(Employee empObj, String email, char[] password) {
		
		System.out.println("Dear " + empObj.getFirstName() + "your generated credentials are as follows");
		System.out.println("Email --> " + email);
		System.out.println("Password --> " + password);
	}

}
