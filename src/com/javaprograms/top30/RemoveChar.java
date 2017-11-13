/**
 * Write a method which will remove any given character from a String
 */
package com.javaprograms.top30;

/**
 * @author Su6z4o7
 *
 */
public class RemoveChar 
{
	/**
	 * @param args
	 */
	static String str = "Frtttttuittvaltett";
	static char chToRemove = 't';
	static char[] ch = str.toCharArray();
	public static void main(String[] args) 
	{
		System.out.println(removeCharWithStringBuffer());
		System.out.println(removeCharWithSubStr());
	}
	
	private static String removeCharWithStringBuffer()
	{
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]!=chToRemove)
			{
				sb.append(ch[i]);
			}
		}
		return sb.toString();
	}
	
	/*
	 * This method is only removing the first occurence of the character
	 * Second and subsequent characters are not removed
	 * Is not a good approach to be followed
	 */
	private static String removeCharWithSubStr()
	{
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<ch.length;i++)
		{
			if (ch[i]== chToRemove)
			{
				String str1 = str.substring(0,i);
				String str2 = str.substring(i+1, ch.length);
				sb.append(str1);
				sb.append(str2);
				break;
			}
		}
		return sb.toString();
		
	}

}
