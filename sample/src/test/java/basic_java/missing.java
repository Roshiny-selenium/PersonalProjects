package basic_java;

public class missing 
{
	public static void main (String[] args)
	{
		int[] array = {1,2,3,5};
		int n =5;

		int expectedsum = n*(n+1)/2;
		int actualsum = 0;
		
		for(int num:array)
		{
			actualsum = actualsum +num;
		}
		
		int missingnumber =  actualsum-expectedsum;
		
		System.out.println(missingnumber);
		
	}

}
