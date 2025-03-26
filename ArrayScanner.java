package javaprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner
{

	public static void main(String[] args)
	{
		Scanner s1=new Scanner(System.in);
		int age[]=new int[4];
		age[0]=s1.nextInt(12);
		age[1]=s1.nextInt(18);
		age[2]=s1.nextInt(45);
		age[3]=s1.nextInt(60);
     
		System.out.println(Arrays.toString(age));
	}

}
