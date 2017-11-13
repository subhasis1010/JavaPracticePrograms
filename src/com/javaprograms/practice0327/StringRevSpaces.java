/**
 * 
 */
package com.javaprograms.practice0327;

import java.util.HashSet;

/**
 * @author Su6z4o7
 * reverse a string text by preserving the text
 *
 */
public class StringRevSpaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String str = "I Am Not String";
		char[] ch1 = str.toCharArray();
		//declare a result array
		char[] resultArray = new char[str.length()];
		//step1 = in the result array set the values as space when the original array has space
		for(int i=0;i<resultArray.length;i++)
		{
			if(ch1[i] == ' ')
			{
				resultArray[i]=' ';
			}
		}
		
		//put the values in the result array
		int len = str.length()-1;
		for(int i=0;i<ch1.length;i++)
		{
			if(ch1[i]!=' ')
			{
				if(resultArray[len] == ' ')
				{
					len--;
				}
				resultArray[len] = ch1[i];
				len--;
			}
		}
		System.out.println(str);
		System.out.println(String.valueOf(resultArray));

	}

}
