package javaprograms;

import java.util.Scanner;

public class ScannerClass
{

	public static void main(String[] args)
	{
	
	  Scanner s1=new Scanner(System.in);
	  System.out.println("The number of a is");
	  int a=s1.nextInt();
	  System.out.println("The number of b is");
	  int b=s1.nextInt();
	  int add=a+b;
	  int sub=a-b;
	  int mul=a*b;
	  int div=a/b;
	  int mod=a%b;
	  System.out.println("Addition of two number is ->"+add);
	  System.out.println("Subtraction of two number is ->"+sub);
	  System.out.println("Multiplication of two number is ->"+mul);
	  System.out.println("Division of two number is ->"+div); 
	  System.out.println("Modulus of two number is ->"+mod);
	  

	}

}
