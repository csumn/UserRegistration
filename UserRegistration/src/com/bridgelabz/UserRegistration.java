package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) {
		System.out.println("Welcome to User Registration Page\n");
		System.out.println("Enter first name\n");
		Scanner scanner = new Scanner(System.in);
		String firstName = scanner.nextLine();
		System.out.println("Enter last name\n");
		String lastName = scanner.nextLine();
		Boolean firstNameCheck = validateFirstName(firstName);
		if (firstNameCheck) {
			System.out.println("Valid first name");
		} else
			System.out.println("Invalid first name");
		Boolean lastNameCheck = validateLastname(lastName);
		if (lastNameCheck) {
			System.out.println("Valid last name");
		} else
			System.out.println("Invalid last name");
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
}
