package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class Collection_Map_remove
{

	public static void main(String[] args) 
	{
		Map<String,String>m1=new HashMap<String,String>();
		  m1.put("Sarika","Gtm56");
	        m1.put("Bhavya", "Gtm78");
	        m1.put("Puja", "Gtm55");
	        m1.put("Nivedita", "Gtm46");
	        m1.put("Shubham", "Gtm50");
	        System.out.println(m1);
	        System.out.println(m1.remove("Puja"));
	        System.out.println(m1.remove("Shubham", "Gtm50"));

	}

}
