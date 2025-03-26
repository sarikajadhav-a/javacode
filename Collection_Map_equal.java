package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class Collection_Map_equal 
{

	public static void main(String[] args) 
	{
		Map<String,Character> m1=new HashMap<String,Character>();
	       m1.put("Sarika", 'f');
	       m1.put("Ganesh", 'M');
	       m1.put("Puja", 'F');
	       m1.put("Pratibha", 'F');
	       m1.put("Mahesh", 'M');
	       m1.put("Shiv", 'M');
	        System.out.println(m1);

			Map<String,Integer>m2=new HashMap<String,Integer>();
			m2.put("Rice", 10);
			m2.put("Jaggery", 20);
			m2.put("Wheat", 10);
			m2.put("Sugar", 1);
			m2.put("Salt", 5);
			System.out.println(m2);
			boolean b1=m1.equals(m2);
			System.out.println(b1);

	}

}
