package javaprograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Collection_Sort 
{

	public static void main(String[] args)
	{
	   ArrayList<String> c1=new ArrayList<String>();
		   c1.add("cat");
		   c1.add("dog");
		   c1.add("horse");
		   c1.add("rat");
		   c1.add("elephant");
		   System.out.println("Before sorting ->"+ c1);
		   Collections.sort( c1);
		   System.out.println("After sorting ->"+ c1);

	}

}
