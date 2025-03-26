package javaprograms;

public class AverageArray 
{

	public static void main(String[] args) 
	{
	   int age[]=new int[5];
	   age[0]=6;
	   age[1]=8;
	   age[2]=16;
	   age[3]=20;
       age[4]=5;
       double sum=0;
       for(int i=0;i<age.length;i++)
       {
    	   sum=sum+age[i];
       }
       System.out.println(sum);
       double average=sum/age.length;
       System.out.println(average);
	}

}
