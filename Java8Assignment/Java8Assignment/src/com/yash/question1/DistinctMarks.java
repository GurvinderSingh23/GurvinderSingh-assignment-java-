//2. WAP to print distinct marks from the list of given marks
package com.yash.question1;

import java.util.Arrays;
import java.util.List;



public class DistinctMarks {

	public static void main(String[] args) {

		List<Integer> listOfMarks = Arrays.asList(12, 23, 43, 24, 42, 76, 24, 43);
		listOfMarks.stream().distinct().forEach(System.out::println);

	}

}
