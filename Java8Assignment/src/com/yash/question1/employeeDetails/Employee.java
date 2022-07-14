package com.yash.question1.employeeDetails;

import java.time.LocalDate;
import java.util.Date;

public class Employee {

	String empName;
	String workLoaction;
	String department;
	double salary;
	LocalDate empDateOfBirth;
	LocalDate dateOfJoining;
	LocalDate dateOfResign;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String empName, String workLoaction, String department, double salary, LocalDate empDateOfBirth,
			LocalDate dateOfJoining, LocalDate dateOfResign) {
		super();
		this.empName = empName;
		this.workLoaction = workLoaction;
		this.department = department;
		this.salary = salary;
		this.empDateOfBirth = empDateOfBirth;
		this.dateOfJoining = dateOfJoining;
		this.dateOfResign = dateOfResign;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getWorkLoaction() {
		return workLoaction;
	}

	public void setWorkLoaction(String workLoaction) {
		this.workLoaction = workLoaction;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getEmpDateOfBirth() {
		return empDateOfBirth;
	}

	public void setEmpDateOfBirth(LocalDate empDateOfBirth) {
		this.empDateOfBirth = empDateOfBirth;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public LocalDate getDateOfResign() {
		return dateOfResign;
	}

	public void setDateOfResign(LocalDate dateOfResign) {
		this.dateOfResign = dateOfResign;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", workLoaction=" + workLoaction + ", department=" + department
				+ ", salary=" + salary + ", empDateOfBirth=" + empDateOfBirth + ", dateOfJoining=" + dateOfJoining
				+ ", dateOfResign=" + dateOfResign + "]";
	}

}
