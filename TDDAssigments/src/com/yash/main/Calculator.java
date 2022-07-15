//Write down a Junit test to check given Calculator. Calculator you have to build will have following features. You will perform following operations in it, Addition, subtraction, multiplication, division, 
//modulus, power, square root and cube root. When performing addition and subtraction result may be comes in negative. When perform multiplication result may come zero. For division and modulus 
//you need to check exception is thrown or not. For power and square root, you have to check negative power is not allowed. 


package com.yash.main;

public class Calculator {
	int result;
	
	public int add(int no1, int no2) {
		return no1 + no2;

	}

	// subtraction
	public int substract(int no1, int no2) {
		result = no1 - no2;
		return result;
	}

	// multiplication
	public int multiply(int no1, int no2) {

		if (no1 == 0 || no2 == 0) {
			result = 0;
		} else {
			result = no1 * no2;
		}
		return result;
	}

	// division
	public int divide(int no1, int no2) {

		result = no1 / no2;
		return result;
	}

}
