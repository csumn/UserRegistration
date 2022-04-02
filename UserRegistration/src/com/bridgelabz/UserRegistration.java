package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to User Registration Page");
		System.out.println("\nEnter first name\n");
		String firstName = scanner.nextLine();

		Boolean firstNameCheck = validateFirstName(firstName);
		if (firstNameCheck) {
			System.out.println("Valid first name");
		} else
			System.out.println("Invalid first name");
		System.out.println("\nEnter last name\n");
		String lastName = scanner.nextLine();
		Boolean lastNameCheck = validateLastname(lastName);
		if (lastNameCheck) {
			System.out.println("Valid last name");
		} else
			System.out.println("Invalid last name");
		System.out.println("\nEnter email id\n");
		String email = scanner.nextLine();
		Boolean emailCheck = validateEmail(email);
		if (emailCheck) {
			System.out.println("Valid email id");
		} else
			System.out.println("Invalid email id");
		scanner.close();
	}

	private static Boolean validateFirstName(String firstName) {
		String matcher = "^[A-Z]{1}[a-z]{2,}$";
		Boolean check = Pattern.matches(matcher, firstName);
		return check;
	}
	private static Boolean validateLastname(String lastName) {
		String lastNameMatcher = "^[A-Z]{1}[a-z]{2,}$";
		Boolean check = Pattern.matches(lastNameMatcher, lastName);
		return check;
	}
	private static Boolean validateEmail(String email) {
		String emailMatcher = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Boolean check = Pattern.matches(emailMatcher, email);
		return check;
	}
}
