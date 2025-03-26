package javaprograms;

public class StringReplace 
{

	public static void main(String[] args) 
	{
		String a="automation";
		System.out.println(a.replace('a', 'm'));
		String a1="automation testing";
		System.out.println(a1.replaceFirst("automation", "api"));
		String name="Sarika Jadhav";
		System.out.println(name.replaceAll("[A-Z]", ""));
		String name1="Kv No 2";
		System.out.println(name1.replaceAll("[a-z]",""));
		String name2="2555 Kv No 2";
		System.out.println(name2.replaceAll("[0-9]", ""));
		

	}

}
