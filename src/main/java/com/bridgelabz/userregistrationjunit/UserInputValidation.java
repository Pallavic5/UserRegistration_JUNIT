package com.bridgelabz.userregistrationjunit;
/*
 * Problem Statement- UC 2 As a User need to enter a valid Last Name
- Last name starts with Cap and has minimum 3 characters
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInputValidation {
	public boolean isValidFirstName(String firstName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(firstName);
		return matcher.matches();
	}
	
	public boolean isValidLastName(String lastName) {
		String regex = "^[A-Z]{1}[a-z]{2,}$";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(lastName);
		return matcher.matches();
	}
}
