package basic_java;

public class Panlindrome_practice {

	public static void main(String[] args) 
	{
		String Str ="madam";
		String reverse ="";
		
		for(int i= Str.length()-1 ; i>=0 ;i--)
		{
			reverse = reverse +Str.charAt(i);
			
		}
		System.out.println("reverse of the String :" + reverse);
		
		if(Str.equals(reverse))
		{
			System.out.println("String is palindrome : " + reverse);
		}
		else
		{
			System.out.println("String is not palindrome");
		}

	}

}
