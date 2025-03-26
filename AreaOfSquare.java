package javaprograms;

import java.util.Scanner;

public class AreaOfSquare 
{

	public static void main(String[] args)
	{
		int l,area;
		Scanner s1=new Scanner(System.in);
		System.out.println("The lenght of Square is:");
		l= s1.nextInt();
	
		area=l*l;
		System.out.println("The Area of Square is:"+ area);
		
	}

}
