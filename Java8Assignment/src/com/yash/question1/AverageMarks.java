//1. WAP to find out average marks from the list of the marks, user will enter the marks through the input box and you need to fetch them and calculate the marks
package com.yash.question1;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AverageMarks {
	
	
	
	public static void main(String[] args) {
		double avgMarks;
		int totalMarks=0;
		Scanner scanner =new Scanner(System.in);
		System.out.println("How many subjects to enter marks ");
		int n=scanner.nextInt();
		List<Integer> list=new ArrayList<Integer>();
		System.out.println("Enter "+ n +" numbers");
	    for(int i=0;i<n;i++)
	    {
	    	list.add(scanner.nextInt());
	    }
	
		avgMarks=list.stream().collect(Collectors.averagingInt(num ->num));
		System.out.print("average marks is"+"  "+avgMarks);
		
	}
}
