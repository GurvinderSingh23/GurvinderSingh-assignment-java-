//Write a Junit test to check given counting of the vowel matched in the given string.
package com.yash.main;

public class VowelCount {
	public static int getCount(String str) {
		int vowelsCount = 0;
		char[] chars = str.toCharArray();
		for (char c : chars) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
				vowelsCount++;
		}
		return vowelsCount;
	}

}
