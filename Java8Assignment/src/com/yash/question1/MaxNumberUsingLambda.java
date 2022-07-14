//12. WAP to find maxium of 5 no , pass array to lambda expression , and return the maximum 
//using lambda expression. dont use nested if else.

package com.yash.question1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxNumberUsingLambda {
	public static Integer getMax(List<Integer> list) {
		return list.stream().collect(Collectors.maxBy(Comparator.naturalOrder())).get();
	}

	public static void main (String[] args)
	{
	List<Integer> list =Arrays.asList(5,4,3,5,4,2,1,7,5,9,0);
	System.out.println("Maximum element is " + getMax(list));

	}

}
