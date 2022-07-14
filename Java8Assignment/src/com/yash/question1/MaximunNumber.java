//4.WAP to find maximum from array of numbers with the help of stream api.
package com.yash.question1;

import java.util.Arrays;
import java.util.Scanner;

public class MaximunNumber {
public static void main(String args[]) {
		
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter how many numbers u  want to enter  ");
		int n=scanner.nextInt();
		int num[]= new int[n];
		System.out.println("Enter "+ n +" numbers");
	    for(int i=0;i<n;i++)
	    {
	        num[i]=scanner.nextInt();
	    }
	
		int max = Arrays.stream(num)
                        .max()
                        .getAsInt();
		 System.out.println("Maximun number is :" + max);
	}

}
