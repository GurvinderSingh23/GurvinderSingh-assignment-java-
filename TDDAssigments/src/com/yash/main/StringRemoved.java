//Write a Junit test to check given string is removed all digits, white space and special character. For example in your main code you will read following string This @ Red $car-.
//When you run your main code it will return following string This red car.
package com.yash.main;

import java.util.StringTokenizer;

public class StringRemoved {
	public String removeSpecialChar(String str) {
		String Data = "";
		str = str.replaceAll("[^a-zA-Z ]", "");

		StringTokenizer st = new StringTokenizer(str);
		while (st.hasMoreTokens()) {
			Data = Data + st.nextToken() + " ";

		}
		return Data.trim();
	}

}
