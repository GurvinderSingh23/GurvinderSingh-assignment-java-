package com.yash.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yash.main.PalindromeNumber;

public class PalindromeNumberTest {

	private PalindromeNumber palindromeNumber;
	private int input;

	@Before
	public void setUp() throws Exception {

		palindromeNumber = new PalindromeNumber();

	}

	@Test
	public void zeroNumberTest() throws Exception {
		assertTrue(palindromeNumber.isPalindrome(input));
	}

	@Test
	public void validNumberTest() throws Exception {

		input = 1221;
		assertTrue(palindromeNumber.isPalindrome(input));
	}

	@Test
	public void inValidNumberTest() throws Exception {

		input = 1234;
		assertFalse(palindromeNumber.isPalindrome(input));
	}

}
