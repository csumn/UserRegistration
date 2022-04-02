package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {
	public static void main(String[] args) {
		Validation validation = new Validation();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to User Registration Page");

		System.out.println("\nEnter first name\n");
		String firstName = scanner.nextLine();
		Boolean firstNameCheck = validation.validateFirstName(firstName);
		if (firstNameCheck) {
			System.out.println("Valid first name");
		} else {
			System.out.println("Invalid first name");
		}
		System.out.println("\nEnter last name\n");
		String lastName = scanner.nextLine();
		Boolean lastNameCheck = validation.validateLastname(lastName);
		if (lastNameCheck) {
			System.out.println("Valid last name");
		} else {
			System.out.println("Invalid last name");
		}
		System.out.println("\nEnter email id\n");
		String email = scanner.nextLine();
		Boolean emailCheck = validation.validateEmail(email);
		if (emailCheck) {
			System.out.println("Valid email id");
		} else {
			System.out.println("Invalid email id");
		}
		System.out.println("\nEnter mobile number\n");
		String phone = scanner.nextLine();
		Boolean phoneCheck = validation.validatePhone(phone);
		if (phoneCheck) {
			System.out.println("Valid phone number");
		} else {
			System.out.println("Invalid phone number");
		}
		System.out.println("\nEnter password\n");
		String password = scanner.nextLine();
		Boolean passwordCheck = validation.validatePassword(password);
		if (passwordCheck) {
			System.out.println("Valid passowrd");
		} else {
			System.out.println("Invalid password");
		}
		scanner.close();
	}
}
