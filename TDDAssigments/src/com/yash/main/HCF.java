//Write a Junit test in which you will take two numbers and you will test that HCF of two numbers are come to same or not
package com.yash.main;

public class HCF 
{
	public int findHCF(int no1,int no2)
	{
		int hcf=0;

	    for (int i = 1; i <= no1 || i <= no2; i++)
	      {
	          if(no1 % i == 0 && no2 % i == 0) 
	          {
	              hcf = i;
	         }
	      }
		return hcf;
	}
}
