package com.bridgelabz.userregistrationjunit;
/*
 * Problem Statement- UC 3 As a User need to enter a valid Email
- E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co) 
and 2 optional (xyz & in) with precise @ and . positions
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

}
