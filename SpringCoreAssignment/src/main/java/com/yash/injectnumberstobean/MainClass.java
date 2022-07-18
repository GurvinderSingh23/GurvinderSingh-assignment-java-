//WAP to inject n numbers to a bean and find out the maximum out of them using stream operator
package com.yash.injectnumberstobean;

import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		try {
			ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationClass.class);
			NumberClass numberClass = ctx.getBean(NumberClass.class);
			List<Integer> numberList = numberClass.getNumbers();
			int maxNumber = numberList.stream().max(Integer::compare).get();
			System.out.println("Maximun number is: " + maxNumber);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
