package javaprograms;

public class AccessSpecifierforMethod

{
	int a=10;
	int b=20;
	private void add()
	{
		System.out.println(a+b);
	}
	public void sub()
	{
		System.out.println(a-b);
	}
	protected void mul()
	{
		System.out.println(a*b);
	}
	void div()
	{
	System.out.println(a/b);	
	}

	public static void main(String[] args) 
	{
		AccessSpecifierforMethod a1=new AccessSpecifierforMethod();
         a1.add();
         a1.sub();
         a1.mul();
         a1.div();


	}

}
