package basic_java;

import java.util.HashMap;

public class HashMap_Practice {

	public static void main(String[] args)
	{
		HashMap<String, String> data = new HashMap<>();
		
		data.put("username" , "Roshiny");
		data.put("1", "one");
		
	String hash =	data.get("1");
	
	System.out.println(hash);
		
		

	}

}
