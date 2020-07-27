package com.wipro.Inheritance;

public class Ex_1Animal {
	public static void main(String[] args) {
		  Ex_1Animal a=new Ex_1Animal();
		  Bird b=new Bird();
		  a.eat();
		  a.sleep();
		  b.eat();
		  b.sleep();
		  b.fly();
		}
		void eat()
		{
		  System.out.println("Animal is Eating");
		}
		void sleep()
		{
		  System.out.println("Animal is Sleeping");
		}
		}

		class Bird extends Ex_1Animal{
		  void eat()
		  {
		    System.out.println("Bird is Eating");
		  }
		  void sleep()
		  {
		    System.out.println("Bird is Sleeping");
		  }
		  void fly()
		  {
		    System.out.println("Bird is flying");
		  }
}
