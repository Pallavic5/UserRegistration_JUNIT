package com.bridgelabz.userregistrationjunit;

/*
 * ProblemStatement : UC 7 Rule3– Should have at least 1 Numeric Number in password
 * - NOTE – All rules must be passed
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

	/*
	 * Mobile Number happy and sad TestCases
	 */
	@Test
	public void testPhoneNumContainsCountryCodeAndSpace_thenHappy() {
		assertTrue(input.isValidMobileNumber("91 9919819801"));
	}

	@Test
	public void testPhoneNumDoesntContainCountryCodeAndSpace_thenSad() {
		assertFalse(input.isValidMobileNumber("991981980"));
	}

	/*
	 * Password happy and sad TestCases
	 */
	@Test
	public void testPasswordAtLeastEightCharacters_thenHappy() {
		assertTrue(input.isValidPassword("jfghikyv"));
	}

	@Test
	public void testPasswordDoesntContainEightCharacters_thenSad() {
		assertFalse(input.isValidPassword("hfhdj"));
	}

	@Test
	public void testPasswordContainsAtLeastOneUpperCaseCharacter_thenHappy() {
		assertTrue(input.isValidPassword("jfghiKyv"));
	}

	@Test
	public void testPasswordDoesntContainUpperCaseCharacter_thenSad() {
		assertFalse(input.isValidPassword("jfghikyv"));
	}

	@Test
	public void testPasswordContainsAtLeastOneNumericNumber_thenHappy() {
		assertTrue(input.isValidPassword("jfghiky5"));
	}

	@Test
	public void testPasswordDoestContainNumber_thenSad() {
		assertFalse(input.isValidPassword("jfghiKyv"));
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
