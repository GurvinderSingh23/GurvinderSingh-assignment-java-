//Write a Junit test to check given number is Armstrong or not
package com.yash.main;
import static java.lang.String.valueOf;

public class Armstrong {
	
	public boolean isValid(int candidate) {
		char[] digits = valueOf(candidate).toCharArray();
		int result = 0;
		System.out.println("abcd");
		for (char digit : digits) {
			int d = Character.digit(digit, 10);
			result += Math.pow(d, digits.length);
		}
		return result == candidate;
	}

}
