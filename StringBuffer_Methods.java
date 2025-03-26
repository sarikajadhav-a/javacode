package javaprograms;

public class StringBuffer_Methods 
{

	public static void main(String[] args)
	{
		StringBuffer s1=new StringBuffer("Automation");
		s1.append(" testing");
		
		System.out.println(s1);
		
		StringBuffer s2=new StringBuffer("Sarika Ashok Jadhav");
		s2.delete(0, 6);
		System.out.println(s2);
		
		StringBuffer s3=new StringBuffer("Sarika  Jadhav");
		s3.insert( 7, "Ashok");
		System.out.println(s3);
		
		StringBuffer s4= new StringBuffer("Sarika Ashok Jadhav");
		System.out.println(s4.substring(7));
		
		StringBuffer s5= new StringBuffer("Sarika Ashok Jadhav");
		System.out.println(s5.substring(7, 12));
		
		StringBuffer s6=new StringBuffer("Sarika");
		s6.reverse();
		System.out.println(s6);
		
		StringBuffer s7=new StringBuffer("Sarika Jadhav");
		s7.replace(7, 13, "Vyavahare");
		System.out.println(s7);
		
		

	}

}
