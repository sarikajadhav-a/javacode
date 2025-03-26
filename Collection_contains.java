package javaprograms;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_contains
{

	public static void main(String[] args) 
	{
		Collection c1=new ArrayList();
		   c1.add("cat");
		   c1.add("dog");
		   c1.add("horse");
		   c1.add("rat");
		   c1.add("elephant");
		   System.out.println(c1);
      
		   
		   System.out.println(c1.contains("wolf"));
          

	}

}
