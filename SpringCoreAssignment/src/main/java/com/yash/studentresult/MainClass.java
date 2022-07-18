//WAP in spring core where we will inject dependent object of result class in student class. In student class following fields will be present studentname, rollno, date of birth, classname, 
//section. Result class will have following fields, rollno, maths,hindi,English, science, as subject name. Create five bean of each and inject the bean as per roll no. Now you need to load the 
//bean from container. Load all the objects in List and filter the data on the basis of total marks obtain by each student.

package com.yash.studentresult;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		
		List<Student> list=new ArrayList<Student>();
		ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigurationStudentResult.class);
		list.add((Student)ctx.getBean("student1"));
		list.add((Student)ctx.getBean("student2"));
		list.add((Student)ctx.getBean("student3"));
		list.add((Student)ctx.getBean("student4"));
		list.add((Student)ctx.getBean("student5"));
		System.out.println(list);
		list.forEach(s->{
			
			double totalMarks=s.getResult().getMathsMarks()+s.getResult().getHindiMarks()+s.getResult().getScienceMarks()+s.getResult().getEnglishMarks();
			System.out.println("{ Roll Number : "+s.getRollNo()+" , Name of Student : "+s.getStudentName()+", Class : "+s.getClassName()+", Section : "+s.getSection()+"} => Total Marks : "+totalMarks);
		});
		
	}

}
