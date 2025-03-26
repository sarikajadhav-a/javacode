package javaprograms;

import java.util.Scanner;

public class CircumferenceOfRectangle
{

	public static void main(String[] args)
	{
		
		int l;
		int b,circumference;
		Scanner s1=new Scanner(System.in);
		System.out.println("The lenght of Rectangle is:");
		l = s1.nextInt();
		System.out.println("The breadth of Rectangle is:");
		b = s1.nextInt();
		circumference=2*l*b;
		System.out.println("Circumference Of Rectangle is:"+ circumference);
				

	}

}
