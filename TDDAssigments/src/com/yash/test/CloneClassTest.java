package com.yash.test;

import org.junit.Test;

import com.yash.main.CloneClass;
import com.yash.main.Singleton;

import junit.framework.Assert;

public class CloneClassTest {

	@Test
	public void testCloneObject() throws CloneNotSupportedException {

		CloneClass cloneClass=new CloneClass();
		CloneClass clone1=cloneClass.getObject(121,"Guri");
		Assert.assertSame("Both objects id are same",121 ,clone1.getId());
		Assert.assertSame("Both objects name are same","Guri" ,clone1.getName());
	}
	
}
