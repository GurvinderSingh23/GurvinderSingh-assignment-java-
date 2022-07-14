package com.yash.question1.employeeDetails;

import java.io.ObjectInputStream.GetField;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeMain {

	static List<Employee> empList = new ArrayList<Employee>();
	static double highestSalary = 0;
	static double lowestSalary = 0;
	static int highestNumberOfEmployee = 0;
	static int lowestNumberOfEmployee = 0;
	static String departmentName=null;

	static Map<String, Integer> mapOfEmployee = new HashMap<>();

	public void addEmployees() throws ParseException {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("** Enter how many Employee details you want to enter **");
			int emps = sc.nextInt();
			for (int i = 1; i <= emps; i++) {
				Employee emp = new Employee();
				System.out.println("Enter Employee Name");
				emp.setEmpName(sc.next());
				System.out.println("Enter Employee WorkLocation(Indore,Pune,Banglore,Delhi)");
				emp.setWorkLoaction(sc.next());
				System.out.println("Enter Employee Department(HR,Java,DB,Python)");
				emp.setDepartment(sc.next());
				System.out.println("Enter Employee Salary");
				emp.setSalary(sc.nextDouble());
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				System.out.println("Enter Employee Date Of Birth(DD/MM/YYYY)");
				emp.setEmpDateOfBirth(LocalDate.parse(sc.next(),formatter));
				System.out.println("Enter Employee Date Of Joining(DD/MM/YYYY)");
				emp.setDateOfJoining(LocalDate.parse(sc.next(),formatter));
				System.out.println("Enter Employee Date of resign(DD/MM/YYYY)");
				emp.setDateOfResign(LocalDate.parse(sc.next(),formatter));
				empList.add(emp);
				System.out.println("**********Successfull Added**********");
			}
		}
		System.out.println(empList);
	}

	public static void main(String[] args) throws ParseException {

		EmployeeMain em = new EmployeeMain();
		em.addEmployees();

		// a. Employee in a particular department.
		Map<String, List<Employee>> eachDepartment = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));
		
		eachDepartment.forEach((department,employee)->{
			System.out.print(department+" :");
			System.out.println(employee);
		});

		// b. Average salary of each department.

		

		eachDepartment.forEach((department, employees) -> {
			
			System.out.print(department + " Department Average Salary :");
			System.out.println(employees.stream().collect(Collectors.averagingDouble(e -> e.salary)));
			
		});

		// c. Highest and lowest salary of each department.

		eachDepartment.forEach((department, employees) -> {
			
			employees.stream().max(Comparator.comparing(Employee::getSalary))
					.ifPresent(emp -> highestSalary = emp.getSalary());
			
			System.out.println("Highest Salary of " + department + " Department:" + highestSalary);
			
			employees.stream().min(Comparator.comparing(Employee::getSalary))
					.ifPresent(emp -> lowestSalary = emp.getSalary());
			
			System.out.println("Lowest Salary of " + department + " Department:" + lowestSalary);
		});

		// d. Department with highest no of employee and lowest no of employee.

		eachDepartment.forEach((department, employees) -> {
			int temp = 0;
			temp = (int) employees.stream().count();
			mapOfEmployee.put(department, temp);
		});
		Map.Entry<String, Integer> maximunEmployee = mapOfEmployee.entrySet().stream()
				.max(Comparator.comparing(Map.Entry::getValue)).get();

		Map.Entry<String, Integer> mininumEmployee = mapOfEmployee.entrySet().stream()
				.min(Comparator.comparing(Map.Entry::getValue)).get();
		
		System.out.println("Department with Highest Employee is * " + maximunEmployee.getKey()
				+ "* which has "+ maximunEmployee.getValue()+" number of Employee" );
		
		System.out.println("Department with lowest Employee is *" + mininumEmployee.getKey() 
		+ "* which has "+ mininumEmployee.getValue()+" number of Employee");
		
		
		//e. Total number of years of experience of each employee.
		empList.stream().forEach(e->{
			Period exp=Period.between(e.getDateOfJoining(), LocalDate.now());
			System.out.println("Experience of Employee"+e.getEmpName()+" is "+exp.getYears()+" years, "+exp.getMonths()+" months, "+exp.getDays()+" days");
		});
		
		//f. Upcoming birthday and job anniversary in current month from current date to last date of month. 
		System.out.println("Upcoming Birthdays on current months ");
		empList.stream().filter(e->e.getEmpDateOfBirth().isAfter(LocalDate.now())).filter(e->e.getEmpDateOfBirth().getMonth().equals(LocalDate.now().getMonth())).forEach(e->{
			System.out.println(e.getEmpName());
			
		});
		
		System.out.println("Upcoming Anniversary on current months ");
		empList.stream().filter(e->e.getDateOfJoining().isAfter(LocalDate.now())).filter(e->e.getDateOfJoining().getMonth().equals(LocalDate.now().getMonth())).forEach(e->{
			System.out.println(e.getEmpName());
			
		});
		
		
	}

}
