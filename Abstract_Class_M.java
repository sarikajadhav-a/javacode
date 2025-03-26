package javaprograms;

abstract class Amazon_Auth
{
	abstract void login();
	abstract void registration();
 
	static void add()
    {
    	
    }
    void substraction()
    {
    	
    }
}

public class Abstract_Class_M extends Amazon_Auth
{
	void login()
	{
		System.out.println("API 1");
		
	}
		
	void registration() 
	{
		System.out.println("API 2");
		
    }

	public static void main(String[] args)
	{
		 Abstract_Class_M a1=new  Abstract_Class_M();
		 a1.login();
		 a1.registration();

	}
	

}
