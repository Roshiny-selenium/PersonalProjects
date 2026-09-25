package basic_java;

public class duplicate_characters
{

	public static void main(String[] args)
	{
		String str = "programming";
		
        char[] chars = str.toCharArray();
        
        for(int i=0 ; i<=chars.length; i++ )
        {
        	for(int j=i+1 ; j<chars.length ; j++)
        	{
        		if(chars[i]== chars[j])
        		{
        			System.out.println(chars[i]);
        			System.out.println(chars.length);
        			
        		}
        	}
        }
	}

}
