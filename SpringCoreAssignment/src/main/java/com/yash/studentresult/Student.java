package com.yash.studentresult;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	private int rollNo;
	private String studentName;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate studentDOB;
	
	private int className;
	private String section;
	
	private Result result;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public LocalDate getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(LocalDate studentDOB) {
		this.studentDOB = studentDOB;
	}
	public int getClassName() {
		return className;
	}
	public void setClassName(int className) {
		this.className = className;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Result getResult() {
		return result;
	}
	public void setResult(Result result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + ", studentDOB=" + studentDOB
				+ ", className=" + className + ", section=" + section + ", result=" + result + "]";
	}
	
}
