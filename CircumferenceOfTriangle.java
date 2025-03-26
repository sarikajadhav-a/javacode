package javaprograms;

import java.util.Scanner;

public class CircumferenceOfTriangle 
{

	public static void main(String[] args)
	{

		int a;
		int b;
		int c,circumference;
		Scanner s1=new Scanner(System.in);
		System.out.println("The a of Triangle is:");
		a = s1.nextInt();
		System.out.println("The b of Triangle is:");
		b=s1.nextInt();
		System.out.println("The c of Triangle is:");
		c=s1.nextInt();
		circumference=a+b+c;
         System.out.println("Circumference of Triangle is:"+ circumference);
 		
       
	}

}
