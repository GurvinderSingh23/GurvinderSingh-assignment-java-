// 7. WAP to print only those price which are even from the given item list.
package com.yash.question1;

import java.util.Arrays;
import java.util.List;

public class PrintOnlyEvenNumber {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
	}

}
