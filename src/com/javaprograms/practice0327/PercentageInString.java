/**
 * 
 */
package com.javaprograms.practice0327;

import java.util.ArrayList;

/**
 * @author Su6z4o7
 * Find Percentage Of Uppercase Letters, Lowercase Letters, Digits And Special Characters In String
 */
public class PercentageInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String str1 = "Tiger Runs @ 200 Speed Of 100 km/hour";
		String str = str1.replaceAll(" ", "");
		int total_Length = str.length();
		int countUpperCase = 0;
		int countLowerCase = 0;
		int countIsDigit = 0;
		int countSpecialChar=0;
		char[] ch = str.toCharArray();
		for(int i=0;i<total_Length;i++)
		{
			if(Character.isUpperCase(ch[i]))
			{
				countUpperCase++;
			}
			else if(Character.isLowerCase(ch[i]))
			{
				countLowerCase++;
			}
			else if(Character.isDigit(ch[i]))
			{
				countIsDigit++;
			}
			else 
			{
				countSpecialChar++;
			}
		}
		System.out.println("count of upper case is "+countUpperCase);
		System.out.println("count of lower case is "+countLowerCase);
		System.out.println("count of digits is "+ countIsDigit);
		System.out.println("count of special characters is "+countSpecialChar);
	}

}
