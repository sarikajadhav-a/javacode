package javaprograms;
class Google_2
{
	Google_2(String name)
	{
		System.out.println("constructor 1");
	}
}
class Google_Auth extends Google_2
{
	Google_Auth(int a)
	{
		super("Sarika");
		System.out.println("constructor 2");
	}
}
public class SuperMultiIn extends Google_Auth
{
	SuperMultiIn()
	{
		super(100);
		System.out.println("constructor 3");
		
	}
public static void main(String[] args)
    {
	new SuperMultiIn();
	
    }
}
