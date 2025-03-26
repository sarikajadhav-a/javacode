package javaprograms;
class ParentClass
{
	void add()
	{
		System.out.println("Adding 2 numbers");
	}
}

public class MethodOverriding extends ParentClass
{
	void add()
	{
		
		System.out.println("Adding 3 numbers");
		super.add();
	}

	public static void main(String[] args) 
	{
	
       MethodOverriding m1=new MethodOverriding();
       m1.add();
	}

}
