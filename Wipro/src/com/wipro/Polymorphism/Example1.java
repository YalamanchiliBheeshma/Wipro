package com.wipro.Polymorphism;

import com.wipro.Polymorphism.Apple;
import com.wipro.Polymorphism.Example1;
import com.wipro.Polymorphism.Orange;
public class Example1 {
	char name,taste,size;
	  
	  public static void main(String args[])
	  {
	    Apple a=new Apple();
	    a.eat();
	    Orange o=new Orange();
	    o.eat();
	  }
	  void eat()
	  {
	    System.out.println("name:Banana");
	    System.out.println("taste:sweet");
	  }
	}
	class Apple extends Example1{
	  void eat()
	  {
	    System.out.println("name:Orange");
	    System.out.println("taste:sweeet");
	  }
	}
	class Orange extends Example1{
	  void eat()
	  {
	    System.out.println("name:Apple");
	    System.out.println("taste:sour");
	  }
}
