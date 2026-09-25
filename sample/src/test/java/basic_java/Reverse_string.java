package basic_java;

public class Reverse_string {

	public static void main(String[] args)
	{
		String Str = "helloworld";
		String reverse = "";
		
		for(int i=Str.length()-1; i>=0; i--)
		{
			reverse= reverse + Str.charAt(i);
		}
		
		System.out.println("reverse of the String :" + reverse);

	}

}
