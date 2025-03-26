package javaprograms;

import java.util.Scanner;

public class LaunchBrowserSC 
{

	public static void main(String[] args)
	{
	int browser=4;
	Scanner s1=new Scanner(System.in);
	System.out.println("The switch case number is:");
	browser=s1.nextInt();
		switch(browser)
		{
		case 1:
		      System.out.println("Chrome browser launch");
		      break;
		
		case 2:
		
			 System.out.println("Mozilla browser launch");
		     break;
		
		case 3:
			 System.out.println("Opera Mini browser launch");
		     break;
		     
		case 4:
			 System.out.println("Safari browser launch");
			 break;
		default:
	    	 System.out.println("Your selection is wrong,kindly press 1,2,3,or 4 only");
	    	 
		}
	}

}
