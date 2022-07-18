//WAP to inject student name and marks into spring bean and you have to use hashmap. Use key as student name and marks as value. And sort all the data and print the records. For 
//example you can inject map in following way.
/*<map> 
<entry key-ref="sunil" value-ref="350"></entry> 
<entry key-ref="anil" value-ref="401"></entry> 
</map>*/ 
package com.yash.injectstudentdetails;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/yash/injectstudentdetails/applicationContext.xml");
		StudentDetails studentDetails=(StudentDetails)ctx.getBean("studentDetails");
		System.out.println(studentDetails.getStudents());
		Map<String,Double> students= studentDetails.getStudents();
		students.entrySet()
		  .stream()
		  .sorted(Map.Entry.<String, Double>comparingByKey())
		  .forEach(System.out::println);
	}
}
