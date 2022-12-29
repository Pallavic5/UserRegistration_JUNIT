package com.bridgelabz.userregistrationjunit;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserRegistrationExceptionTest {
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
	public void testFirstNameStartsWithCapitalLetterAndHasWithMinimumThreeCharacters_thenHappy() throws UserRegistrationException {
		System.out.println("First");
		try {
			assertTrue(input.isValidFirstName("Pallavi"));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testFirstNameDoesntStartWithCapitalLetterAndDontHaveMinimumThreeCharacters_thenSad()throws UserRegistrationException {
		System.out.println("Second");
		try {
			assertTrue(input.isValidFirstName("pallavi"));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * LastName Happy and Sad TestCase
	 */
	@Test
	public void testLastNameStartsWithCapitalLetterAndHasWithMinimumThreeCharacters_thenHappy() throws UserRegistrationException{
		try {
			assertTrue(input.isValidLastName("Punewar"));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testLastNameDoesntStartWithCapitalLetterAndDontHaveMinimumThreeCharacters_thenSad() throws UserRegistrationException{
		try {
		assertFalse(input.isValidLastName("punewar"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * Email Happy and Sad TestCase
	 */
	@Test
	public void testEmailContainsRequiredCharacter_thenHappy()throws UserRegistrationException {
		try {
		assertTrue(input.isValidEmail("abc.xyz@bl.co.in"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testEmailDoestContainRequiredCharacter_thenSad()throws UserRegistrationException {
		try {
		assertFalse(input.isValidEmail("Abc.@bl.co.src.in"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * Mobile Number happy and sad TestCases
	 */
	@Test
	public void testPhoneNumContainsCountryCodeAndSpace_thenHappy()throws UserRegistrationException {
		try {
		assertTrue(input.isValidMobileNumber("91 9919819801"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testPhoneNumDoesntContainCountryCodeAndSpace_thenSad() throws UserRegistrationException {
		try {
		assertFalse(input.isValidMobileNumber("991981980"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	/*
	 * Password happy and sad TestCases
	 */
	@Test
	public void testPasswordAtLeastEightCharacters_thenHappy() throws UserRegistrationException {
		try {
		assertTrue(input.isValidPassword("jfghikyv"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testPasswordDoesntContainEightCharacters_thenSad()throws UserRegistrationException {
		try {
		assertFalse(input.isValidPassword("hfhdj"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}	
	@Test
	public void testPasswordAtLeastOneUpperCase_thenHappy()throws UserRegistrationException {
		try {
			assertTrue(input.isValidPassword("jfghiKyv"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testPasswordDoesntContainUpperCase_thenSad()throws UserRegistrationException {
		try {
			assertFalse(input.isValidPassword("jfghiKyv"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testPasswordContainsAtLeastOneNumericNumber_thenHappy()throws UserRegistrationException {
		try {
			assertTrue(input.isValidPassword("jfgP8yhi"));
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testPasswordDoesntContainNumber_thenSad()throws UserRegistrationException {
		try {
			assertFalse(input.isValidPassword("jfghikyv"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testPasswordHasExactlySpecialCharacters_thenHappy()throws UserRegistrationException {
		try {
		assertTrue(input.isValidPassword("jfgjhyh@"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void testPasswordDoesntContainSpecialCharacters_thenSad()throws UserRegistrationException {
		try {
			assertFalse(input.isValidPassword("jfghikyv"));
		}catch(Exception e) {
			e.printStackTrace();
		}
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
