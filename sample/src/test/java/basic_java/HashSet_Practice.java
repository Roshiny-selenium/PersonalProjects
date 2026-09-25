package basic_java;

import java.util.HashSet;
import java.util.Set;

public class HashSet_Practice {

	public static void main(String[] args)
	
	// Remove duplicate and give the data -- hashset 
	{
		HashSet<String> data = new HashSet<>();
		
		data.add("Roshiny");
		data.add("firefox");
		data.add("Roshiny");
		
		for(String data1 :data)
		{
			if(!data.add(data1))
			{
				System.out.println(data1);
			}
		}

	}

}
