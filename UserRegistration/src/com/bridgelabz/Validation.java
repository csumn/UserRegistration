package com.bridgelabz;

import java.util.regex.Pattern;

public class Validation {
	public Boolean validateFirstName(String firstName) {
		String matcher = "^[A-Z]{1}[a-z]{2,}$";
		Boolean check = Pattern.matches(matcher, firstName);
		return check;
	}
	public Boolean validateLastname(String lastName) {
		String lastNameMatcher = "^[A-Z]{1}[a-z]{2,}$";
		Boolean check = Pattern.matches(lastNameMatcher, lastName);
		return check;
	}
	public Boolean validateEmail(String email) {
		String emailMatcher = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";
		Boolean check = Pattern.matches(emailMatcher, email);
		return check;
	}
	public Boolean validatePhone(String phone) {
		String mobileNoMatcher = "^([0-9]{2}\\s)?[6789]{1}[0-9]{9}";
		Boolean check = Pattern.matches(mobileNoMatcher, phone);
		return check;
	}
	public Boolean validatePassword(String password) {
		String passwordMatcher = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,}$";
		Boolean check = Pattern.matches(passwordMatcher, password);
		return check;
	}
}
