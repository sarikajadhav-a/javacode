package javaprograms;
interface GrandParent
{
	void mul();
	void div();
}
abstract class Parent_1 implements GrandParent 
{
	abstract void mul1();
	abstract void div1();
	void looptoprintname()
	{
		System.out.println("Logic to expose");
	}
}

public class Interface_MultiLevel extends Parent_1
{
	public void mul() 
	{
	
	}


   public void div()
  {
	
	
  }


   void mul1() 
   {
	
	
   }

   void div1() 
   {
	
	
   }
   
  /* public static void main(String[] args)
	{
		

	}*/

	
}
