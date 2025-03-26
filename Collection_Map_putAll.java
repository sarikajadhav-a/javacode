package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class Collection_Map_putAll 
{

	public static void main(String[] args)
	{
		Map<String,String> m1=new HashMap<String,String>();
        m1.put("Sarika","Gtm56");
        m1.put("Bhavya", "Gtm78");
        m1.put("Puja", "Gtm55");
        m1.put("Nivedita", "Gtm46");
        m1.put("Shubham", "50");
        System.out.println(m1);
		
		Map <String,String>m2=new HashMap<String,String>();
	       m2.putAll(m1);
	       m2.put("King", "Gtm40");
	       m2.put("Sunny", "Gtm65");
	       
	        System.out.println(m2);


	}

}
