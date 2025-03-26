package javaprograms;

public class Method_overloading
{

	  static void add()
	  {
		  System.out.println("print 444");
	  }
	  static void add(int a)
	  {
		  System.out.println("print a is 404");
	  }
	  void add(double a)
	  {
		  System.out.println("print 2.55"); 
	  }
	
	
	
	public static void main(String[] args)
	{
     add();
     add(404);
     Method_overloading m1=new  Method_overloading();
     m1.add(2.55);
	}

}
