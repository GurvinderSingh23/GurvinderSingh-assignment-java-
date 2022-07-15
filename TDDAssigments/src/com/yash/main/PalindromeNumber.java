//Write a Junit test to check given number is palindrome
package com.yash.main;

public class PalindromeNumber {

	public boolean isPalindrome(int num) {
		
		String string = Integer.toString(num);
		String reverseString = new StringBuilder(string).reverse().toString();
		
		if(string.equals(reverseString)) {
			System.out.println("Number is palindrome");
			return true;
		}
		else {
			System.out.println("Number is not palindrome");
			return false;
		}
	}

}
