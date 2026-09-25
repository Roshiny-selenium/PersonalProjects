package basic_java;

import java.util.HashSet;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Getduplicates_hashset {

	public static void main(String[] args)
	{
		String[] stringdata = {"chrome","firefox","chrome","edge","safari"};
		
		HashSet<String> duplicate = new HashSet<>();
		
		for(String duplicates: stringdata)
		{
			if(!duplicate.add(duplicates))
			{
				System.out.println(duplicates);
			}
		}
		
		
			

	}

}
