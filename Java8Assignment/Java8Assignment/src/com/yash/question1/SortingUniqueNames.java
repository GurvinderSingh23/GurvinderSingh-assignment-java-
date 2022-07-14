//3. WAP to take name of employee, sort all employee name using stream and print only unique name from it.
package com.yash.question1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortingUniqueNames{

	public static void main(String[] args) {
		List < String > employees = new ArrayList < String > ();
  try(Scanner sc= new Scanner(System.in)){
	  System.out.println("enter the 5 names of employees");
	  for(int i=0;i<5;i++)
	  {
		  employees.add(sc.next());
	  }
  }

  System.out.println("the sorted and distinct names of employees::");        
       employees.stream()
            .sorted().distinct().collect(Collectors.toList()).forEach(System.out::println);; //ascending order
       
    }	
}
