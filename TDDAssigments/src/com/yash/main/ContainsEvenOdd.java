//Write a Junit test to check given array of numbers contains given number of even or not.
package com.yash.main;

import java.util.ArrayList;

public class ContainsEvenOdd {
	public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
		ArrayList<Integer> oddNumbers = new ArrayList<Integer>();
		ArrayList<Integer> evenNumbers = new ArrayList<Integer>();
		for (int number : numbers) {
			if (number % 2 == 0) {
				oddNumbers.add(number);
			} else {
				evenNumbers.add(number);
			}
		}
		return oddNumbers;
	}

}
