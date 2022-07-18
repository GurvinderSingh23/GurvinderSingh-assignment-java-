// WAP in spring core to demonstrate role based object creation using factory method
package com.yash.factorymethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/yash/factorymethod/applicationContext.xml");
		DeveloperRole dr = ctx.getBean(DeveloperRole.class);
		dr.role();
		DBRole db = ctx.getBean(DBRole.class);
		db.role();

	}

}
