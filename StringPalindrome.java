package javaprograms;

public class StringPalindrome 
{

	public static void main(String[] args)
	{
		String input="radar";
		String output="";
		for(int i=input.length()-1;i>=0;i--)
		{
			char c1=input.charAt(i);
			output=output+c1;
			
		}
		System.out.println(output);

      if(input.equals(output)==true)
      {
    	 System.out.println("It is Palindrome");
    	 
      }
      else
      {
    	  System.out.println("It is Not Palindrome");
      }

	}

}
