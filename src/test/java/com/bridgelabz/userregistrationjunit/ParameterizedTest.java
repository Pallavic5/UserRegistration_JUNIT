package com.bridgelabz.userregistrationjunit;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterizedTest {
	public UserInputValidation validation; // create objects of class
	private String email;
	private boolean result;
	/*
	 * Parameterized Constructor
	 */
	public ParameterizedTest(String email, boolean result) {
		super();
		this.email = email;
		this.result = result;
	}
	/*
	 * initialize class object
	 */
	@Before
	public void initialise() {
		validation = new UserInputValidation();
	}
	@Test
	public void testEmailIsInCorrectFormat() {
		boolean match = validation.isValidEmail(email);
		Assert.assertEquals(match, result);
	}
	@Parameterized.Parameters(name = "{index}: email({0})={1}")			//passing the parameter
	public static Collection<Object[]> input() {
		return Arrays.asList(new Object[][] { { "abc@yahoo.com", true }, { "abc-100@yahoo.com", true },
				{ "abc.100@yahoo.com", true }, { "abc111@abc.com", true }, { "abc-100@abc.net", true },
				{ "abc.100@abc.com.au", true }, { "abc@1.com", true }, { "abc@gmail.com.com", true },
				{ "abc+100@gmail.com", true }, { "abc", false }, { "abc@.com.my", false }, { "abc123@gmail.a", false },
				{ "abc123@.com", false }, { "abc123@.com.com", false }, { ".abc@abc.com", false },
				{ "abc()*@gmail.com", false }, { "abc@%*.com", false }, { "abc..2002@gmail.com", false },
				{ "abc.@gmail.com", false }, { "abc@abc@gmail.com", false }, { "abc@gmail.com.1a", false },
				{ "abc@gmail.com.aa.au", false } });
	}
}
