package javaprograms;

import java.util.ArrayList;
import java.util.Collections;

public class Collection_SortInt 
{

	public static void main(String[] args)
	{
		ArrayList<Integer> c1=new ArrayList();
		c1.add(5);
		c1.add(10);
		c1.add(15);
		c1.add(20);
		c1.add(25);
		System.out.println("Before sorting->"+c1);
		Collections.sort(c1);
		System.out.println("After sorting->" +c1);

	}

}
