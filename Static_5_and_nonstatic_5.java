package javaprograms;

public class Static_5_and_nonstatic_5 {
          static void add()
          {
        	System.out.println("ABC");  
          }
          static void add(int a, int b)
          {
        	  System.out.println("a is 4 and b is 10");   
          }
          static void add(char c, String s)
          {
        	  System.out.println(  "char and  string");  
          }
          static void add(double a, float b)
          {
        	  System.out.println("double and float");  
          }
          static void add(boolean c, char b)
          {
        	  System.out.println("true and abc");  
          }
          
          
          
          
          
          void sub()
          {
        	  System.out.println("substraction");  
          }
          void sub(short r,char c)
          {
        	  System.out.println("44 , C");  
          }
          void sub(int a, float f)
          {
        	  System.out.println("100 and 40f");  
          }
          void sub(char a, int d)
          {
        	  System.out.println("char is B and int is 50");  
          }
          void sub(String a, boolean l)
          {
        	  System.out.println("sarika and true");  
          }
          
          
          
          
	
	
	public static void main(String[] args)
	{
		add();
		add(4,10);
		add('A',"SARIKA");
		add(4.55,5.5f);
		add(true,'A');
		
		 Static_5_and_nonstatic_5 s1=new  Static_5_and_nonstatic_5();
				 s1.sub();
		 Static_5_and_nonstatic_5 s2=new  Static_5_and_nonstatic_5();
				 s2.sub(44,'C');
		 Static_5_and_nonstatic_5 s3=new  Static_5_and_nonstatic_5();
				 s2.sub(100,40f);
		 Static_5_and_nonstatic_5 s4=new  Static_5_and_nonstatic_5();
				 s4.sub('B',50);
		 Static_5_and_nonstatic_5 s5=new  Static_5_and_nonstatic_5();
		         s5.sub("sarika",true);
	}

}
