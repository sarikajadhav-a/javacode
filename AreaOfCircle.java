package javaprograms;

import java.util.Scanner;

public class AreaOfCircle 
{

	public static void main(String[] args) 
	{
		int  r;
		double pivalue=Math.PI,area;
		Scanner s1=new Scanner(System.in);
		System.out.println("The radius of circle is:");
		r = s1.nextInt();
		
		area= pivalue*r*r;
		System.out.println("The area of circle is:"+area);
		

	}

}
