package javaprograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Collection_for_eachloop {

	public static void main(String[] args) 
	{
		Map<String,String>m1=new HashMap<String,String>();
		  m1.put("Sarika","Gtm56");
	        m1.put("Bhavya", "Gtm78");
	        m1.put("Puja", "Gtm55");
	        m1.put("Nivedita", "Gtm46");
	        m1.put("Shubham", "Gtm50");
	        System.out.println("Fetching all keys ->"+m1);
	        
	        for(String s1:m1.keySet()) 
	        {
	        	System.out.println(s1);
	        }
	        
	        
	        System.out.println("Fetching all values ->");
	        for(String s2:m1.values())
	        {
	        	System.out.println(s2);
	        }
	        
	        for(Entry<String, String> s3:m1.entrySet())
	        {
	        	System.out.println(s3);
	        }

	}

}
