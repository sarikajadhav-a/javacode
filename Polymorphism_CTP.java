package javaprograms;

class class1
{
	void add() 
	{
		System.out.println("polymorphism at Compile time");
	}
}


public class Polymorphism_CTP {
	void add()
	{
	   System.out.println("print");
	}

	public static void main(String[] args) 
	{
		Polymorphism_CTP c1=new Polymorphism_CTP();// child class object
		c1.add();//
        class1 c2=new class1();//parent class object
        
        c1.add();
	}

}
