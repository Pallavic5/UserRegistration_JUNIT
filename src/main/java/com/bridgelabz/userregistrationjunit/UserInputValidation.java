package com.bridgelabz.userregistrationjunit;
/*
 * Problem Statement- UC 1 As a User need to enter a valid First Name
- First name starts with Cap and has minimum 3 characters
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
}
