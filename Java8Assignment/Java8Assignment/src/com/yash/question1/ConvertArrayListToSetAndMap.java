//10. WAP to create 10 objects of employee class, add all object to arraylist and from arraylist we need to convert this to map and set using stream api.
package com.yash.question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Employee{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	
	
}

public class ConvertArrayListToSetAndMap {
	
	public static void main(String[] args) {
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee(1,"Guri"));
		empList.add(new Employee(2,"Vimal"));
		empList.add(new Employee(3,"Akash"));
		empList.add(new Employee(4,"Snehal"));
		empList.add(new Employee(5,"Meenal"));
		empList.add(new Employee(6,"Anirudh"));
		empList.add(new Employee(7,"Tanay"));
		empList.add(new Employee(8,"Sabbir"));
		empList.add(new Employee(9,"Praksh"));
		empList.add(new Employee(10,"Yash"));
		
		//ArrayList to Set
		Set<Employee> empSet=empList.stream().collect(Collectors.toSet());
		
		//ArrayList to Map
		Map<Integer, Employee> empMap=empList.stream().collect(Collectors.toMap(e->e.id, e->e));
		
		System.out.println("ArrayList to Set: "+empSet);
		System.out.println("ArrayList to Map: "+empMap);
		
		
	}
	
	

}
