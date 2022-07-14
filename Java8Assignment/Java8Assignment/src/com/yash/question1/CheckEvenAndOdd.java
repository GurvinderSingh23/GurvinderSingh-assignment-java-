//8. WAP to implement predicate to check given no is even or not
package com.yash.question1;

import java.util.Scanner;
import java.util.function.Predicate;

public class CheckEvenAndOdd {

	public static void checkEvenOdd(int num) {
		Predicate<Integer> predicate = p -> (p % 2 == 0);
		if (predicate.test(num)) {
			System.out.println("Number is Even");
		} else {
			System.out.println("Number is Odd");
		}
	}

	public static void main(String[] args) {
		int number;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number to check even or odd : ");
			number = sc.nextInt();
			checkEvenOdd(number);
		}

	}

}
