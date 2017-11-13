/**
 * How to Count Occurrences of a Character in String - Java Programming Exercise Example
 */
package com.javaprograms.top30;

import java.util.Scanner;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Su6z4o7
 *
 */
public class CharacterOccurenceInString 
{

	/**
	 * @param args
	 */
	static char charToCount = 'c';
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		
		System.out.println("number of occurences of a character is "+countCharacter(str));
		//System.out.println(StringUtils.countMatches("india", 'i'));

	}
	
	private static int countCharacter(String str)
	{
		int count= 0;
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i] == charToCount)
			{
				count++;
			}
		}
		// this is a one line solution to the above logic that has been implemented
		int no = StringUtils.countMatches(str, charToCount); 
		System.out.println("number of occurrence using sprint util is "+no);
		return count;
	}
	
	

}
