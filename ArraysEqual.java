package javaprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysEqual
{

	public static void main(String[] args)
	{
		int[] age=new int[4];
		int[] age1=new int[4];
		for(int i=0;i<=3;i++)
		{
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the value for index ->"+i);
			age[i]=s1.nextInt();
			age1[i]=s1.nextInt();
			}
		System.out.println(Arrays.toString(age));
		System.out.println(Arrays.toString(age1));
		boolean b1=Arrays.equals(age,age1);
		System.out.println(b1);
		if(b1==true)
		{
			System.out.println("Arrays are Equals");
		}
		else
		{
			System.out.println("Arrays are not Equals");
		}
	}

}
