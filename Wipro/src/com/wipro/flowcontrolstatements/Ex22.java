package com.wipro.flowcontrolstatements;

public class Ex22 {
	public static void main(String[] args)
	{
	int n=Integer.parseInt(args[0]);
	int r=0;
	while(n!=0)
	{
		int digit=n%10;
		r=r*10+digit;
		n/=10;
	}
	System.out.println("Reversed number :"+r);
	}
	
}
