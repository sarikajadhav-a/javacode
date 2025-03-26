package javaprograms;

import java.util.Scanner;

public class CircumferenceOfCircle
{

	public static void main(String[] args)
	{
		
		int  r;
		double pivalue=Math.PI,circumference;
		Scanner s1=new Scanner(System.in);
		System.out.println("The radius of circle is:");
		r = s1.nextInt();
		
		circumference=2*pivalue*r;
		System.out.println("Circumference Of Circle is:"+ circumference);
 
       
	}

}
