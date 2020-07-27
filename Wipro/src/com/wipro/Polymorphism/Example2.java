package com.wipro.Polymorphism;

public class Example2 {
	public static void main(String[] args) {
	    Example2 c=new Circle();
	    Example2 t=new Triangle();
	    Example2 s=new Square();
	    c.draw();
	    c.erase();
	    t.draw();
	    t.erase();
	    s.draw();
	    s.erase();
	    
	  }
	void draw()
	{
	  System.out.println("Drawing Shape");
	}
	void erase()
	{
	  System.out.println("Erasing Shape");
	}

	}

	class Circle extends Example2{
	  void draw()
	  {
	    System.out.println("Drawing circle");
	  }
	  void erase()
	  {
	    System.out.println("Erasing Cirle");
	  }
	}

	class Triangle extends Example2{
	  void draw()
	  {
	    System.out.println("Drawing Triangle");
	  }
	  void erase()
	  {
	    System.out.println("Erasing Triangle");
	  }
}
	class Square extends Example2{
		  void draw()
		  {
		    System.out.println("Drawing Square");
		  }
		  void erase()
		  {
		    System.out.println("Erasing Square");
		  }
		}