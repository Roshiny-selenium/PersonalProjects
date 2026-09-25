package basic_java;

public class Duplicate {

	public static void main(String[] args)
	{
		String[] stringdata = {"chrome","firefox","chrome","edge","safari"};
		
		for(int i=0 ;i<stringdata.length ; i++)
		{
			for(int j=i+1; j<stringdata.length; j++)
			{
				if(stringdata[i] == stringdata[j])
				{
					System.out.println(stringdata[j]);
				}
			}
		}

	}

}
