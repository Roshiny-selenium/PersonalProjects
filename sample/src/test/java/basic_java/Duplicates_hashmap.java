package basic_java;

import java.util.HashMap;

public class Duplicates_hashmap {

	public static void main(String[] args)
	{

        String[] browsers = {"chrome", "firefox", "chrome", "edge", "safari"};

        HashMap<String, Integer> map = new HashMap<>();

        for (String browser : browsers) {
            map.put(browser, map.getOrDefault(browser, 0) + 1);
        }

        for (String browser : map.keySet()) {

            if (map.get(browser) > 1) {
                System.out.println(browser);
            }
        }
    }
}