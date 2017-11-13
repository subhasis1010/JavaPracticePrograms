/**
 * 
 */
package com.javaprograms.practice0327;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Su6z4o7
 * Anagram program in java
 *
 */
public class AnagramProgram 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String str3 = "Dormitory";
		String str4 = "Dirty Room1";
		String str1 = str3.toLowerCase().replaceAll("\\s", "");
		String str2 = str4.toLowerCase().replaceAll("\\s", "");
		
		System.out.println("Checked using Arrays class "+checkAnagram1(str1, str2));
		System.out.println("Checked using HashMaps "+checkAnagram2(str1, str2));

	}
	
	//In this method we create a hashmap, count the value as occurences of each key
	private static boolean checkAnagram2(String str1, String str2) 
	{
		boolean status = true;
		
		if(str1.length()!= str2.length())
		{
			status = false;
		}
		else
		{
			// Construct a map with character and integer
			HashMap<Character, Integer> hm = new HashMap<>();
			for(int i=0;i<str1.length();i++)
			{
				//getting all the characters
				char charAtKey = str1.charAt(i);
				//initialize the character count
				int charCountAsValue = 0;
				//check whether map contains this char
				if(hm.containsKey(charAtKey))
				{
					charCountAsValue = hm.get(charAtKey);
				}
				//put characters and its count to map
				hm.put(charAtKey, ++charCountAsValue);
				
				// Now decrement from str2
				charAtKey = str2.charAt(i);
				//initialize the character count
				charCountAsValue = 0;
				//check whether map contains this char
				if(hm.containsKey(charAtKey))
				{
					charCountAsValue = hm.get(charAtKey);
				}
				//put characters and its count to map
				hm.put(charAtKey, --charCountAsValue);
			}
			
			for(int value: hm.values())
			{
				if(value!=0)
				{
					status = false;
				}
			}
		}
		
		return status;
	}
	// first way to check anagram program
	private static boolean checkAnagram1(String str1, String str2) 
	{	
		char[] ch1;
		char[] ch2;
		Boolean status = true;
		if(str1.length() != str2.length())
		{
			status = false;
		}
		else
		{
			ch1 = str1.toCharArray();
			ch2 = str2.toCharArray();
			Arrays.sort(ch1);;
			Arrays.sort(ch2);
			status = Arrays.equals(ch1, ch2);
		}
		return status;
	}

}
