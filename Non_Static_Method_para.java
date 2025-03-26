package javaprograms;

public class Non_Static_Method_para {

	void Add(int a, int b)
	{
		System.out.println(a+b);
	}
	void Sub(char a,char b)
	{
		System.out.println("Substraction");
	}
	
	
	
	public static void main(String[] args)
	{
		Non_Static_Method_para A1=new Non_Static_Method_para();
		A1.Add(25,20);
		A1.Sub('A','b');
		
		
		
		
		

	}

}
