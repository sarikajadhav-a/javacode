package javaprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Collection_List
{

	public static void main(String[] args)
	{
		List l1=new ArrayList();
		l1.add(765);
		l1.add(-78);
		l1.add(85);
		l1.add(0);
		l1.add("sun");
		l1.add("moon");
		l1.add(44);
		l1.add("sun");
		l1.add("moon");
		l1.add("true");
		
		
		ListIterator i1=l1.listIterator();
		System.out.println("Using Iterator forward direction Iteration:");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		
		
		System.out.println("Using ListIterator forward Iteration:");
		ListIterator i2=l1.listIterator();
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		
		System.out.println("Using ListIterator backward Iteration:");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}

	}

}
