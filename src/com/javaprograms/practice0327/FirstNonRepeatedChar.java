/**
 * Needs lots of improvement, I had to check this program multipl times
 */
package com.javaprograms.practice0327;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author su6z4o7
 * Find the first non repeated character in a string
 *
 */
public class FirstNonRepeatedChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		
		System.out.println("First non repeated character in string "+str+" is "+findChar(str));

	}

	private static char findChar(String str) 
	{
		int len = str.length();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0;i<len;i++)
		{
			char ch = str.charAt(i);
			if(hm.containsKey(ch))
			{
				hm.put(ch, hm.get(ch)+1);
			}
			else
			{
				hm.put(ch, 1);
			}
		}
		
		for(int i=0;i<str.length();i++)
		{
			char ch1 = str.charAt(i);
			if(hm.get(ch1).equals(1))
			{
				return ch1;
			}
		}
		throw new RuntimeException();
		

	}

}
