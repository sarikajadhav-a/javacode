package javaprograms;

public class ThisCalling 
{
	ThisCalling ()
	{
		this("Sarika");
		System.out.println("This is Non para");
	}
	ThisCalling(String str)
	{
		this(50);
		System.out.println("This is parameterized");
	}
	ThisCalling(int a)
	{
		System.out.println("100");
	}
		

	public static void main(String[] args)
	{
		new  ThisCalling ();

	}

}
