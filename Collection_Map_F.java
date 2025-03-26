package javaprograms;

import java.util.HashMap;
import java.util.Map;

public class Collection_Map_F 
{

	public static void main(String[] args) 
	{
		Map<String,Integer>m1=new HashMap<String,Integer>();
		m1.put("Rice", 10);
		m1.put("Jaggery", 20);
		m1.put("Wheat", 10);
		m1.put("Sugar", 1);
		m1.put("Salt", 5);
		System.out.println(m1);

	}

}
