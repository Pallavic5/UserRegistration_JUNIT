package com.bridgelabz.userregistrationjunit;
/*
 * Problem Statement- UC 3 As a User need to enter a valid Email
- E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl & co) 
and 2 optional (xyz & in) with precise @ and . positions
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
	/*
	 * FirstName Happy and Sad TestCase
	 */
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
	/*
	 * LastName Happy and Sad TestCase
	 */
	@Test
	public void testLastNameStartsWithCapitalLetterAndHasWithMinimumThreeCharacters_thenHappy() {
		assertTrue(input.isValidLastName("Punewar"));
	}
	@Test
	public void testLastNameDoesntStartWithCapitalLetterAndDontHaveMinimumThreeCharacters_thenSad() {
		assertFalse(input.isValidLastName("punewar"));
	}
	/*
	 * Email Happy and Sad TestCase
	 */
	@Test
	public void testEmailContainsRequiredCharacter_thenHappy() {
		assertTrue(input.isValidEmail("abc.xyz@bl.co.in"));
	}
	@Test
	public void testEmailDoestContainRequiredCharacter_thenSad() {
		assertFalse(input.isValidEmail("Abc.@bl.co.src.in"));
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
