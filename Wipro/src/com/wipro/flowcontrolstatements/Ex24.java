package com.wipro.flowcontrolstatements;

public class Ex24 {
public static void main(String[] args) 
{
	for(int i=1;i<=150;i++)
	{
		if(i%2==0&&i%3==0&&i%5==0)
		{
			System.out.println(i+", ");
		}
	}
}
}
