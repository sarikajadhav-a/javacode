package javaprograms;

class Google
{
	Google()
	{
		System.out.println("Google Constructor");
	}
}

public class SuperCallingAmazonNP extends Google
{
   
	SuperCallingAmazonNP()
	{
		super();
		System.out.println("Amazon Constructor");
	}
	
	
public static void main(String[] args)
	{
		
         new SuperCallingAmazonNP();
	}

}
