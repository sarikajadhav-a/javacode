package javaprograms;

import java.util.Enumeration;
import java.util.Vector;

public class Enumaration {

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add(4);
		v.add(5);
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		

	}

}
