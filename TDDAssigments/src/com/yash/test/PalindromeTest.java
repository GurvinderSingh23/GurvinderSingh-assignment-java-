package com.yash.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.yash.main.Palindrome;

public class PalindromeTest {

	private Palindrome palindrome;
	private String input;

	@Before
	public void setUp() throws Exception {

		input = null;
		palindrome = new Palindrome();

	}

	@After
	public void tearDown() throws Exception {

	}

	@Test(expected = NullPointerException.class)
	public void nullStringTest() throws Exception {

		palindrome.isPalindrome(null);

	}

	@Test
	public void emptyStringTest() throws Exception {

		input = "";

		assertTrue(palindrome.isPalindrome(input));

	}

	@Test
	public void multipleWhiteSpaceTest() throws Exception {

		input = "A santa     at      Nasa";

		assertTrue(palindrome.isPalindrome(input));

	}

	@Test
	public void singleCharTest() throws Exception {

		input = "H";

		assertTrue(palindrome.isPalindrome(input));

	}

	@Test
	public void punctuationTest() throws Exception {

		input = "Eva, can I see bees in a cave?";

		assertFalse(palindrome.isPalindrome(input));

	}

	@Test
	public void unicodeTest() throws Exception {

		input = "\u20A9 My gym \u20A9";

		assertFalse(palindrome.isPalindrome(input));

	}

	@Test
	public void alphaNumericPalindromeTest() throws Exception {

		input = "Gur i23 32 irug ";

		assertTrue(palindrome.isPalindrome(input));
	}

	@Test
	public void validPalindromeTest() throws Exception {

		input = "No lemon no melon";

		assertTrue(palindrome.isPalindrome(input));
	}

	@Test
	public void invalidPalindromeTest() throws Exception {

		input = "I am a Mr.singh";

		assertFalse(palindrome.isPalindrome(input));
	}
}
