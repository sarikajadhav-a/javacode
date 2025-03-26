package basicprograms;

public class Nonstatic_method
{
	void login()
	{
		System.out.println("Login with email ID");
		
	}
	void logout()
	{
		System.out.println("Logout with email ID ");
	}
	

	public static void main(String[] args) 
	{
		
        Nonstatic_method n1=new Nonstatic_method();
        n1.login();
        n1.logout();
	}

}
