package com.yash.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.yash.main.VowelCount;

class VowelCountTest {

	 @Test
	    public void testCase1() {
	      assertEquals("Nope!", 4, VowelCount.getCount("Gurvinder Singh"));
	    }

}
