package javaprograms;

import java.util.Scanner;

public class AreaOfTriangle 
{

	public static void main(String[] args)
	{
		int b;
		int h,area;
		Scanner s1=new Scanner(System.in);
		System.out.println("The base of Triangle is:");
		b = s1.nextInt();
		System.out.println("The height of Triangle is:");
		h=s1.nextInt();
		
		area=(b*h)/2;
		System.out.println("Area of Triangle is:"+area);

	}

}
