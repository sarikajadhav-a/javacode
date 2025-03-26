package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class Collection_Map_contains 
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
	        System.out.println(m1.containsKey("Bhavya"));
	        System.out.println(m1.containsValue('F'));


	}

}
