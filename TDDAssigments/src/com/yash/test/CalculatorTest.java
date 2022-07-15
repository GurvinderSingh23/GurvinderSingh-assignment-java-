package com.yash.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.yash.main.Calculator;

class CalculatorTest {

	Calculator calculator = new Calculator();

	@Test
	void testAdd() {
		assertEquals(30, calculator.add(20, 10));

	}

	@Test
	void testDivide1() {
		assertEquals(2, calculator.divide(20, 10));

	}

	@Test
	void testSubstract() {
		assertEquals(10, calculator.substract(20, 10));

	}

	@Test
	void testMultiplyByZeroFirst() {
		assertEquals(0, calculator.multiply(20, 0));
	}

	@Test
	void testMultiplyByZeroSecond() {
		assertEquals(0, calculator.multiply(0, 10));
	}

	@Test
	void testMultiply() {
		assertEquals(200, calculator.multiply(20, 10));
	}

	@Test
	void testDivide() {
		assertEquals(2, calculator.divide(20, 10));
	}

	@Test

	public void testArithmeticException() {
		assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
	}

}
