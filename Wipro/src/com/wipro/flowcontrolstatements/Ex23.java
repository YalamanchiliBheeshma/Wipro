package com.wipro.flowcontrolstatements;

public class Ex23 {
	public static void main(String[] args)
	{
	int n=Integer.parseInt(args[0]);
	int r=0,temp,sum=0;
	temp=n;
	while(n!=0)
	{
	r=n%10;
	sum=sum*10+r;
	n=n/10;
	}
	if(sum==temp)
	System.out.println(temp+" is a palindrome");
	else
	System.out.println(temp+" is not a palindrome");
	}
}
