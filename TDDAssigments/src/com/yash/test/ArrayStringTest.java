package com.yash.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.yash.main.ArrayString;

class ArrayStringTest {

	@Test
	public void test1() {
		
		ArrayString arrayString = new ArrayString();
		
		String [] str = {"apple","orange","banana","lemon"};
		String expected = "apple-orange-banana-lemon";
		String actual = arrayString.StringConcate(str);
		assertEquals(expected,actual);
	}
	
	
	@Test
	public void test2() {
		
		ArrayString arrayString = new ArrayString();
		
		String [] str = {"APPLE","ORANGE","BANANA","LEMON"};
		
		String expected = "apple-orange-banana-lemon";
		String actual = arrayString.StringConcate(str);
		
		assertEquals(expected,actual);
	}

}
