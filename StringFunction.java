package javaprograms;

import java.util.Arrays;

public class StringFunction
{

	public static void main(String[] args)
	{
	  String name="Sarika";
	  System.out.println(name.toUpperCase());
	  String name1="Sarika Jadhav";
	  System.out.println(name1.toLowerCase());
	  String name2="     Sarika Jadhav";
	  System.out.println(name2.trim());
	  String a="australia";
	  System.out.println(a.charAt(0));
	  String a1="australia";
	  System.out.println(a1.indexOf('s'));
	  String s1="Banglore";
	  System.out.println(s1.substring(2));
	  String s2="Banglore";
	  System.out.println(s2.substring(0, 4));
	  String n1="Automation Batch";
	  System.out.println(n1.equals("Automation Batch"));
	  String n2="Jadhav";
	  System.out.println(n2.contains("Jadhav "));
	  String z1="Testing";
	  System.out.println(z1.equalsIgnoreCase("Testing"));
      String s3="abcde";
      char[] c1= s3.toCharArray();
      System.out.println(Arrays.toString(c1));
	}

}
