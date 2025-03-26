package javaprograms;

public class Static_Nonstatic_Npara
{

	static void add()
	{
		System.out.println("Addition");
	}
	static void sub()
	{
		System.out.println("Subtraction");
	}
	void login()
	{
		System.out.println("login");
	}
	void logout()
	{
		System.out.println("logout");
	}
	
	 Static_Nonstatic_Npara()
	 {
		 System.out.println("Constructor"); 
	 }
	
	
	
	
	public static void main(String[] args)
	{
     add();
     sub();
     Static_Nonstatic_Npara l1=new Static_Nonstatic_Npara ();
     l1.login();
     Static_Nonstatic_Npara l2=new Static_Nonstatic_Npara();
     l2.logout();
     new  Static_Nonstatic_Npara();
     
    		 
     
	}

}
