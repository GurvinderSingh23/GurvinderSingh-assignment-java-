//9. WAP to implement predicate to check given list of array contain how many even and odd nos.
package com.yash.question1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class UsePredicateToCountEvenOdd implements Predicate<Integer>{
	
	int even=0;
	int odd=0;
	@Override
	public boolean test(Integer t) {
		if(t%2==0)
		{
			even++;
			return true;
		}
		else
		{
			odd++;
			return false;
		}
	}

	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7);
		UsePredicateToCountEvenOdd obj=new UsePredicateToCountEvenOdd();
		for(int i:list)
		{
			obj.test(i);
		}
		System.out.println("Even number: "+obj.even);
		System.out.println("Odd number: "+obj.odd);
		
	}

	
}
