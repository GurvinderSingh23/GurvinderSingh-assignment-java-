package com.yash.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.yash.main.PalindromeNumber;
import com.yash.main.PythagorasTemplate;

public class PythagorasTemplateTest {

	PythagorasTemplate pythagorasTemplate;
	private int a;
	private int b;
	private int c;

	@Before
	public void setUp() throws Exception {
		pythagorasTemplate = new PythagorasTemplate();
	}
	
	@Test
	public void satisfiedCondition()
	{
		a=6;b=8;c=10;
		assertTrue(pythagorasTemplate.isSatisfyPythagorasTemplate(a, b, c));
	}
	@Test
	public void unSatisfiedCondition()
	{
		a=1;b=7;c=10;
		assertFalse(pythagorasTemplate.isSatisfyPythagorasTemplate(a, b, c));
	}

}
