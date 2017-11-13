/**
 * Reverse Each Word Of A String In Java
 */
package com.javaprograms.practice0327;

/**
 * @author Su6z4o7
 *
 */
public class ReverseEachWord 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String str1 = "Java Concept Of The Day";
		String[] strArray = str1.split(" ");
		StringBuffer sb  = new StringBuffer();
		for(int i=0;i<strArray.length;i++)
		{
			System.out.print(reverseWords(strArray[i])+" ");
		}
		
	}

	private static StringBuffer reverseWords(String s) 
	{
		char[] ch = s.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=ch.length-1;i>=0;i--)
		{
			sb.append(ch[i]);
			
		}
		return sb;
		
	}

}
