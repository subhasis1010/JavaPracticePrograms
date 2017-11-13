/**
 * First Non Repeated Character in a String - Java Programming Problem
 */
package com.javaprograms.top30;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @author Su6z4o7
 *
 */
public class FirstNonRepeated {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		System.out.println("first non repeated character in string " +str + " is " + nonRepeatedChar(str));
	}
	
	private static char nonRepeatedChar(String str)
	{
		HashMap<Character, Integer> hm = new HashMap<>();
		for(int i=0;i<str.length();i++)
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
		//since hashmap doesn't maintain insertion order
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(hm.get(c) == 1)
			{
				return c;
			}
		}
		throw new RuntimeException("exception");
	}
}
