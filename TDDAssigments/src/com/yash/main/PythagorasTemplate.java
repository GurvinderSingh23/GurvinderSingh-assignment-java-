package com.yash.main;

public class PythagorasTemplate {
	
	public boolean isSatisfyPythagorasTemplate(int a,int b,int c)
	{
		if(a*a==((b*b)+(c*c)) || b*b==((a*a)+(c*c)) || c*c==((b*b)+(a*a))) {
			System.out.println("Satisfied Pythagoras Template");
			return true;
		}
		else {
			System.out.println("Not Satisfied Pythagoras Template");
			return false;
		}
	}

}
