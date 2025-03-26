package javaprograms;

import java.util.Arrays;

public class ArrayaReverse
{

	public static void main(String[] args) 
	{
		int input[]=new int[4];
		input[0]=6;
		input[1]=8;
		input[2]=16;
		input[3]=20;
		input[4]=5;
		int output[]=new int[input.length];
		for(int i=0,j=3;i<input.length;i++,j--)
		{
			output[j]= input[i];
		}
		
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(output));

	}

}
