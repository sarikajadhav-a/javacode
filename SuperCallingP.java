package javaprograms;

class Amazon
{
	Amazon(String Name)
	{
		System.out.println("Amazon constructor");
	}
}

public class SuperCallingP extends Amazon
{
	SuperCallingP()
	{
		super("Sarika");
		System.out.println("SuperCallingP constructor");
	}

	public static void main(String[] args) 
	{
	
        new SuperCallingP();
	}

}
