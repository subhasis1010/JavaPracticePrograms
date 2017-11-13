/**
 * 
 */
package samplePrograms;

import java.util.Arrays;

/**Validate if two strings are anagram in java
 * @author Su6z4o7
 *
 */
public class AnagramProgram {

	/**
	 * @param args
	 */
	static boolean result;
	static String str1 = "hello";
	static String str2 = "lloeh";
	public static void main(String[] args) 
	{
		if (checkAnagram() == true)
			{
				System.out.println("Strings are Anangrams");
			}
		else
		{
			System.out.println("Not Anagram");
		}
	}
	
	public static boolean checkAnagram()
	{
		if(str1.length()!=str2.length())
		{
			result = false;
			System.out.println("this method called");
		}
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		result =  Arrays.equals(ch1, ch2);
		return result;
	}

}
