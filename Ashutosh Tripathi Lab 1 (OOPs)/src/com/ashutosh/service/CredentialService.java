package com.ashutosh.service;

import java.util.Random;

import com.ashutosh.model.Employee;

public class CredentialService {
	
	public char[] generatePassword() {
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = capitalLetters.toLowerCase();
		String numbers = "0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>()";
		
		String values = capitalLetters + smallLetters + numbers + specialCharacters;
		
		Random rand = new Random();
		
		char[] pwd = new char[8];
		
		for(int i=0; i<8; i++) {
			pwd[i] = values.charAt(rand.nextInt(values.length()));
		}
		
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
