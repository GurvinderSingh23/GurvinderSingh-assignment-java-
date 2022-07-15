package com.yash.test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import org.junit.Test;
import com.yash.main.Singleton;

import junit.framework.Assert;

public class SingletonTest {
	@Test
	public void TestSingletonObject() {

		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		Assert.assertSame("Both objects are same", instance1, instance2);
	}

}
