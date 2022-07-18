package com.yash.studentresult;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.yash.studentresult")
public class ConfigurationStudentResult {
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	@Bean("result1")
	public Result result1() {
		Result result1 = new Result();
		result1.setRollNo(101);
		result1.setMathsMarks(65.4);
		result1.setHindiMarks(54.4);
		result1.setEnglishMarks(45.2);
		result1.setScienceMarks(76);

		return result1;
	}

	@Bean("result2")
	public Result result2() {
		Result result2 = new Result();
		result2.setRollNo(102);
		result2.setMathsMarks(47.4);
		result2.setHindiMarks(97.4);
		result2.setEnglishMarks(46.2);
		result2.setScienceMarks(74);

		return result2;
	}

	@Bean("result3")
	public Result result3() {
		Result result3 = new Result();
		result3.setRollNo(103);
		result3.setMathsMarks(63.4);
		result3.setHindiMarks(51.4);
		result3.setEnglishMarks(49.2);
		result3.setScienceMarks(68);

		return result3;
	}

	@Bean("result4")
	public Result result4() {
		Result result4 = new Result();
		result4.setRollNo(104);
		result4.setMathsMarks(45.4);
		result4.setHindiMarks(34.4);
		result4.setEnglishMarks(49);
		result4.setScienceMarks(73.3);

		return result4;
	}

	@Bean("result5")
	public Result result5() {
		Result result5 = new Result();
		result5.setRollNo(105);
		result5.setMathsMarks(66.4);
		result5.setHindiMarks(58.4);
		result5.setEnglishMarks(65.2);
		result5.setScienceMarks(86);

		return result5;
	}
	
	@Bean("student1")
	public Student student1()
	{
		Student student1=new Student();
		student1.setRollNo(101);
		student1.setStudentName("Guri");
		student1.setStudentDOB(LocalDate.parse("23/09/1999",formatter));
		student1.setClassName(9);
		student1.setSection("A");
		student1.setResult(result1());
		return student1;
	}
	@Bean("student2")
	public Student student2()
	{
		Student student2=new Student();
		student2.setRollNo(102);
		student2.setStudentName("Akash");
		student2.setStudentDOB(LocalDate.parse("02/08/1997",formatter));
		student2.setClassName(8);
		student2.setSection("A");
		student2.setResult(result2());
		return student2;
	}
	@Bean("student3")
	public Student student3()
	{
		Student student3=new Student();
		student3.setRollNo(103);
		student3.setStudentName("Shakti Maan");
		student3.setStudentDOB(LocalDate.parse("01/01/1970",formatter));
		student3.setClassName(8);
		student3.setSection("B");
		student3.setResult(result3());
		return student3;
	}
	@Bean("student4")
	public Student student4()
	{
		Student student4=new Student();
		student4.setRollNo(104);
		student4.setStudentName("Jhamunda");
		student4.setStudentDOB(LocalDate.parse("12/02/1998",formatter));
		student4.setClassName(9);
		student4.setResult(result4());
		student4.setSection("B");
		return student4;
	}
	@Bean("student5")
	public Student student5()
	{
		Student student5=new Student();
		student5.setRollNo(105);
		student5.setStudentName("Mayank");
		student5.setStudentDOB(LocalDate.parse("09/07/1990",formatter));
		student5.setClassName(9);
		student5.setSection("B");
		student5.setResult(result5());
		return student5;
	}
}
