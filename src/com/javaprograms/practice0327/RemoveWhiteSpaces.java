/**
 * 
 */
package com.javaprograms.practice0327;

/**
 * @author Su6z4o7
 * Remove white spaces from a string
 *
 */
public class RemoveWhiteSpaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		//using replaceAll method
		String str= "mission bay area";
		String str1 = str.replaceAll("\\s", "");
		System.out.println(str1);
		
		//without using replaceAll method
		char[] strArray = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			if((strArray[i]!=' ') && (strArray[i]!='\t'))
			{
				sb.append(strArray[i]);
			}
				
		}
		System.out.println(sb);
				
	}

}
