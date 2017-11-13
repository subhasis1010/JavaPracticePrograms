/**
 * Check whether the string is palindrome
 * Also remove any character from a string - defined in another program
 * included the condition where character to remove was not found
 */
package com.javaprograms.top30;

import java.util.Scanner;

import org.apache.commons.lang3.text.StrTokenizer;

/**
 * @author Su6z4o7
 */
public class PalindromeRemoveCharString 
{
	static StringBuffer sb = new StringBuffer();
	static char charToRemove = 'c';
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String strToCheck = scan.nextLine();
		String strRemoveChar = scan.nextLine();
		
		checkPalindrome(strToCheck);
		removeCharacter(strRemoveChar);
	}
	
	private static void removeCharacter(String strRemoveChar) 
	{
		int count=0;
		char[] ch = strRemoveChar.toCharArray();
		sb = new StringBuffer();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==charToRemove)
			{
				sb.append("");
				count++;
			}else
			{
				sb.append(ch[i]);
			}
		}
		if(count == 0){
			System.out.println("the character to remove was not found");
		}
		else{
			System.out.println("String after removing character is "+sb.toString());
		}
		
	}

	private static void checkPalindrome(String str)
	{
		char[] ch = str.toCharArray();
		sb = new StringBuffer();
		for(int i =ch.length-1;i>=0;i--)
		{
			sb.append(ch[i]);
		}
		String strReverse = sb.toString();
		
		if(str.equals(strReverse))
		{
			System.out.println("its palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}

}
