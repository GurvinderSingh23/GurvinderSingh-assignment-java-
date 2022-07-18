package com.yash.shapes;

import java.util.Scanner;

public class Circle implements Shape {

	@Override
	public double areaOfShape() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Radius of circle: ");
		double r=sc.nextDouble();
		sc.close();
		return r*r*(22/7);
	}

	@Override
	public double sidesOfShape() {
		return Double.POSITIVE_INFINITY;
	}

}
