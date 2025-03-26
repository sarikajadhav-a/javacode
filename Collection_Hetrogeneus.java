package javaprograms;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_Hetrogeneus 
{

	public static void main(String[] args) 
	{
		Collection c1=new ArrayList();
		   c1.add("cat");
		   c1.add("dog");
		   c1.add("horse");
		   c1.add("rat");
		   c1.add("elephant");
		   c1.add(11);
		   c1.add('x');
		   c1.add(9.81);
		   c1.add(true);
		   System.out.println(c1);


	}

}
