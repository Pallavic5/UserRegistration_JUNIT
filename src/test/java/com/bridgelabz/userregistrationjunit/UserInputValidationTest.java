package com.bridgelabz.userregistrationjunit;
/*
 * Problem Statement- UC 2 As a User need to enter a valid Last Name
- Last name starts with Cap and has minimum 3 characters
 */
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserInputValidationTest {
	/*
	 * declare the class object static
	 */
	static UserInputValidation input = null;

	/*
	 * In the BeforeClass and AfterClass we can initialize the class object, this
	 * both classes are only called once and there method should be static.
	 */
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class");
		input = new UserInputValidation(); // initialize object.
	}

	/*
	 * Before and After method run for each test cases.
	 */
	@Before
	public void before() {
		System.out.println("Before");
	}
	@Test
	public void testFirstNameStartsWithCapitalLetterAndHasWithMinimumThreeCharacters_thenHappy() {
		System.out.println("First");
		assertTrue(input.isValidFirstName("Pallavi"));
	}
	@Test
	public void testFirstNameDoesntStartWithCapitalLetterAndDontHaveMinimumThreeCharacters_thenSad() {
		System.out.println("Second");
		assertTrue(input.isValidFirstName("pallavi"));
	}
	@Test
	public void testLastNameStartsWithCapitalLetterAndHasWithMinimumThreeCharacters_thenHappy() {
		assertTrue(input.isValidLastName("Punewar"));
	}

	@Test
	public void testLastNameDoesntStartWithCapitalLetterAndDontHaveMinimumThreeCharacters_thenSad() {
		assertFalse(input.isValidLastName("punewar"));
	}
	@After
	public void after() {
		System.out.println("After");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("After Class");
		input = new UserInputValidation(); // initialize object.
	}
}
