//11. wap to perform parrallel stream api to find the no
package com.yash.question1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindNumberWithParellelStream {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		int number;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter a number to find: ");
			number = sc.nextInt();

		}

		boolean status = list.parallelStream().anyMatch(n -> n == number);
		if (status)
			System.out.println(number + " is Perest");
		else
			System.out.println(number + " is not Perest");

	}

}
