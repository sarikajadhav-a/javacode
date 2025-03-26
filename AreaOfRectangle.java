package javaprograms;

import java.util.Scanner;

public class AreaOfRectangle
{

	public static void main(String[] args)
	{
		int l;
		int b,area;
		Scanner s1=new Scanner(System.in);
		System.out.println("The lenght of Rectangle is:");
		l = s1.nextInt();
		System.out.println("The breadth of Rectangle is:");
		b = s1.nextInt();
		area=l*b;
		System.out.println("Area of Rectangle is:"+area);

	}

}
