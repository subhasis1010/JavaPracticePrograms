/**
 * 
 */
package com.javaprograms.practice0327;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Su6z4o7
 * Program to find duplicate characters and their count in Java
 *
 */
public class DuplicateCharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String str = "baingan tester hollow";
		//remove duplicates from string
		String str1 = str.replaceAll("\\s", "");
		
		HashMap<Character, Integer> hm = new HashMap();
		
		
		char[] ch = str1.toCharArray();
		
		for(int i=0;i<str1.length();i++)
		{
			if(hm.containsKey(ch[i]))
			{
				hm.put(ch[i], hm.get(ch[i])+1);
			}
			else
			{
				hm.put(ch[i], 1);
			}
		}
		
		Set<Character> charInString = hm.keySet();
		
		for(Character ch1:charInString)
		{
			if(hm.get(ch1)>1)
			{
				System.out.println(ch1+" "+hm.get(ch1));
			}
		}
		
	}

}
