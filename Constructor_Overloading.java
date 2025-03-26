package javaprograms;

public class Constructor_Overloading
{
	 Constructor_Overloading(double a)
	 {
		 
		 System.out.println("This is 1st constructor");
	 }
	 Constructor_Overloading(int a)
	 {
		 
		 System.out.println("This is 2nd constructor");
	 }
	 Constructor_Overloading(int a, int b, String c)
	 {
		 System.out.println("This is 3rd constructor");
	 }
	 
	public static void main(String[] args) 
	{
		new  Constructor_Overloading(9.8);
		new  Constructor_Overloading(100);
		new    Constructor_Overloading(100,25,"sarika");
		 

	}

}
