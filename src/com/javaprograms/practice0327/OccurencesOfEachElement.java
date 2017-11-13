/**
 * 
 */
package com.javaprograms.practice0327;

import java.util.HashMap;
import java.util.Set;

/**
 * @author Su6z4o7
 * Find the occurences of each element
 *
 */
public class OccurencesOfEachElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String strWithSpaces = "Java J2EE Java JSP J2EE";
		//remove spaces
		String strWithoutSpaces = strWithSpaces.replaceAll("\\s", "");
		getCountOccuences(strWithoutSpaces);
	}

	private static void getCountOccuences(String strWithoutSpaces) 
	{
		HashMap<Character, Integer> hm = new HashMap();
		char[] ch = strWithoutSpaces.toCharArray();
		
		for(char ch1: ch)
		{
			if(hm.containsKey(ch1))
			{
				hm.put(ch1, (hm.get(ch1)+1));
			}
			else
			{
				hm.put(ch1, 1);
			}
		}
		
		Set<Character> charInString = hm.keySet();
		for(char ch2: charInString)
		{
			System.out.println(ch2 +" --- "+ hm.get(ch2));
		}
		
	}

}
