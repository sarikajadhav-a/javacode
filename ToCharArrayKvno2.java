package javaprograms;

import java.util.Arrays;

public class ToCharArrayKvno2
{
	static int countof__alphabet=0;
	static int countof_numeric=0;
	static int countof_space=0;
	

	public static void main(String[] args)
	{
		String a="kv no 2";
		char c1[]=a.toCharArray();
		System.out.println(Arrays.toString(c1));
		
		for(int i=0;i<a.length();i++)
		{
			boolean v1=Character.isAlphabetic(c1[i]);
			boolean v2=Character.isDigit(c1[i]);
			boolean v3=Character.isWhitespace(c1[i]);
			
			if(v1==true)
			{
				 countof__alphabet++;
			}
			if(v2==true)
			{
				countof_numeric++;
			}
			if(v3==true)
			{
				countof_space++;
			}
			

			
		}
		
		System.out.println("The count of alphabet in the given Array=>"+ countof__alphabet);
		System.out.println("The count of alphabet in the given Array=>"+countof_numeric);
		System.out.print("The count of alphabet in the given Array=>"+countof_space);
		int countof_special=c1.length- (countof__alphabet+countof_numeric+countof_space);
		System.out.print("The count of special character in the given Array=>"+countof_special);
		
	}

}
