package com.bridgelabz.userregistrationjunit;
/*
 * ProblemStatement : UC 5 As a User need to follow pre-defined Password rules.
Rule1 – minimum 8 Characters - NOTE – All rules must be passed
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInputValidation {
	static String regex;
	static Pattern pattern;
	static Matcher matcher;

	public boolean isValidFirstName(String firstName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(firstName);
		return matcher.matches();
	}

	public boolean isValidLastName(String lastName) {
		regex = "^[A-Z]{1}[a-z]{2,}$";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(lastName);
		return matcher.matches();
	}

	public boolean isValidEmail(String email) {
		regex = "^[a-z]+[+-_.]*[a-z]*[@][a-z]+[.][a-z]{2,4}[.]*([a-z]{2,3})*$";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public boolean isValidMobileNumber(String mobileNumber) {
		regex = "^[0-9]{2} [0-9]{10}$";
		pattern = Pattern.compile(regex);
		matcher = pattern.matcher(mobileNumber);
		return matcher.matches();
	}
	
	public boolean isValidPassword(String password) {
	    regex = "^\\w{8,}$";			//\w \Any word character, short for [a-zA-Z_0-9]
	    pattern = Pattern.compile(regex);
		matcher = pattern.matcher(password);
		return matcher.matches();
	  }

	
}
