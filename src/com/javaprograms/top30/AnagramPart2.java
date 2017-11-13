/**
 * Anagram program using the sort() methods
 */
package com.javaprograms.top30;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author su6z4o7
 *
 */
public class AnagramPart2 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		String anagram = scan.nextLine();
		// this would remove all spaces in the string
		String copyOfWord = word.replaceAll("\\s", "");
		String copyOfAnagram  = anagram.replaceAll("\\s", "");
		
		//convert to a character array
		char[] chWord= copyOfWord.toLowerCase().toCharArray();
		char[] chAnagram = copyOfAnagram.toLowerCase().toCharArray();
		
		//Arrays sorting
		Arrays.sort(chWord);
		Arrays.sort(chAnagram);
		System.out.println(chWord);
		System.out.println(chAnagram);
		
		//compare two results using .equals() method
		boolean result = Arrays.equals(chWord, chAnagram);
		if(result == true)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("not anagram");
		}
	}

}
