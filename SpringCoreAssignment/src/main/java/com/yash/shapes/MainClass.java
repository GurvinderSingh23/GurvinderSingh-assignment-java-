//WAP in which you have to create objects on user demands. For example we are having a Interface Shape, now class circle, rectangle and square implements shape interface and 
//shape interface is having two methods. Area and sides of the shape. Now user will choose which class object he wants and on the basis of that you need to print the result.
package com.yash.shapes;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/yash/shapes/applicationContext.xml");
		 
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter shape of that which you want to a object:(rectangle/circle/square) :");
		String shapeName=scanner.next();
		Shape shape=(Shape)ctx.getBean(shapeName);
		System.out.println("Area of shape : "+shape.areaOfShape());
		System.out.println("Side of shape : "+ shape.sidesOfShape());
		
	}

}
