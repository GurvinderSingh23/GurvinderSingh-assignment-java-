package com.yash.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.yash.main.HCF;

public class HCFTest {

	@Test
	public void test() 
	{
		HCF main = new HCF();
		int no1 = 30;
		int no2 = 50;
		
		int expected = 10;
		
		int actual = main.findHCF(no1, no2);
		assertEquals(expected,actual);
	}
	
	
	

}
