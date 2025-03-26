package javaprograms;

import java.util.Date;

public class DateClassEpochTimeCurrent
{

	public static void main(String[] args) 
	{
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());//current time
		Date d3=new Date(d1.getTime() +(1000*60*60*24));//future time
		Date d4=new Date(d1.getTime() -(1000*60*60*24*2));//past time
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);
		
		String humantimeC=d2.toString();
		String month=humantimeC.substring(4, 7);
		//System.out.println(month);
		String date=humantimeC.substring(8, 10);
		String year=humantimeC.substring(humantimeC.length()-4);
		String format1=date.concat(month).concat(year);
		System.out.println(format1);
		
		
		
		/*String humantimeF=d3.toString();
		//System.out.println(year);
		String month1=humantimeF.substring(4, 7);
		//System.out.println(month1);
		String date1=humantimeF.substring(8, 10);
		String year1=humantimeF.substring(humantimeF.length()-4);
		//System.out.println(year);*/
		
		
		//String format2=date.concat(month).concat(year);
		//System.out.println(format2);
		/*String format2=date.concat(" ").concat(month).concat(" ").concat(year);
		System.out.println(format2);
		String format3=date.concat("-").concat(month).concat("-").concat(year);
		System.out.println(format3);
		String format4=date.concat("/").concat(month).concat("/").concat(year);
		System.out.println(format4);*/
		
		

	}

}
