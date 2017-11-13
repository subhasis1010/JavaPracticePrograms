/**
 * Java program - String Anagram Example. 
 * This program checks if two Strings are anagrams or not
 */
package com.javaprograms.top30;

import java.util.Scanner;

/**
 * @author Su6z4o7
 *
 */
public class AnagramCheck {

	/**
	 * This way is assuming both methods are not null and in lower case
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		String anagram = scan.nextLine();
		
		System.out.println(checkAnagram(word, anagram));


	}
	
	private static boolean checkAnagram(String word, String anagram)
	{
		if(word.length()!= anagram.length()) // check if the length matches, if it doesn't return false
		{
			return false;
		}
		
		char[] chars = word.toCharArray(); // advanced for loop to convert word into a character array
		for(char c:chars)
		{
			int index = anagram.indexOf(c);
			if(index!=-1)
			{
				anagram = anagram.substring(0, index) + anagram.substring(index+1); // need to understand whats this step doing
			}
			else
			{
				return false;
			}
		}	
		return anagram.isEmpty();
		
		//word.replaceAll(arg0, arg1)

		
	}
	
	

}
