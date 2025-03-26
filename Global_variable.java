package javaprograms;

public class Global_variable
{
	int a=10;
	static double b=20.9;

	public static void main(String[] args)
	{
		b=40.5;
		System.out.println(b);
		 Global_variable g1=new   Global_variable();
		
		 g1.a=100;
		 System.out.println(g1.a);		 
				 
	}

}
