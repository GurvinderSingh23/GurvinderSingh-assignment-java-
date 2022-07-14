// 6. WAP to create list of item price whose price is less than avg price of all item.
package com.yash.question1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PriceLessThanAverage {
	public static void main(String[] args) {
		List<Integer> priceList=Arrays.asList(10000,11000,12000,9990);
		double avrg=priceList.stream().collect(Collectors.averagingInt(p->p));
		
		List<Integer> avrPriceLessItem= priceList.stream().filter(n->(n<avrg)).collect(Collectors.toList());
		System.out.println(avrPriceLessItem);
	}

}
