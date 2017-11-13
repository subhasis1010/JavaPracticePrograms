package programConcepts;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HashMapTest 
{

	public static void main(String[] args) 
	{
		//HashMap<Integer, String> hm = new HashMap<Integer, String>();
		Hashtable<Integer, String> hm = new Hashtable<Integer, String>();
		hm.put(10, "abc");
		hm.put(20, "def");
		hm.put(30, "ghi");
		
		//This is how you can traverse the map
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+"---"+m.getValue());
		}
		System.out.println(hm);
		
		StringBuffer sb = new StringBuffer("This is a stringbuffer  ");
		System.out.println(sb);
		sb.append("its not difficult");
		System.out.println(sb.toString());
		
		WebDriver driver = new FirefoxDriver();
		
	}

}
