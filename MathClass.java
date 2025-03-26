package javaprograms;

public class MathClass 
{

	public static void main(String[] args)
	{
	System.out.println(Math.addExact(10,10));
	System.out.println(Math.addExact(2225,1234));
	System.out.println(Math.subtractExact(50, 26));
	System.out.println(Math.subtractExact(258425,123456));
	System.out.println(Math.multiplyExact(25,10));
	System.out.println(Math.multiplyExact(25842,2));
	System.out.println(Math.multiplyExact(25842,12345));
	System.out.println(Math.max(2.25,4.50));
	System.out.println(Math.max(4.4,8.8));
	System.out.println(Math.max(24,10));
	System.out.println(Math.max(258421,123451));
	System.out.println(Math.min(42.25,41.44));
	System.out.println(Math.min(25.5,12.5));
	System.out.println(Math.min(258425,123456));
	System.out.println(Math.min(258425,123456));
	System.out.println(Math.abs(25.33));
	System.out.println(Math.abs(2.8));
	System.out.println(Math.abs(254));
	System.out.println(Math.abs(-2589652));
	System.out.println(Math.absExact(65));
	System.out.println(Math.absExact(-2587456));
	double pivalue=Math.PI;//its not method it is global variable present in the math.lang class
	System.out.println(pivalue);
	System.out.println(Math.random());
	}

}
