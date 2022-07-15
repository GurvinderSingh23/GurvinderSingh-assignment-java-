package com.yash.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.yash.main.StringRemoved;

class StringRemovedTest {

	@Test
	public void test1() 
	{
		
		StringRemoved stringRemoved = new StringRemoved();
	   String  str = "This @ Red $car-";
	   String expected = "This Red car";
	   
	   String actual = stringRemoved.removeSpecialChar(str);
	   assertEquals(expected, actual);
	}
	
	
	@Test
	public void test2() 
	{
		
	   StringRemoved sr = new StringRemoved();
	   String  str = "M@#y n4546ame 643is G&^uri";
	   String expected = "My name is Guri";
	   
	   String actual = sr.removeSpecialChar(str);
	   assertEquals(expected, actual);
	}

}
