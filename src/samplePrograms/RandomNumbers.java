/**
 * Other programs
 */
package samplePrograms;

import java.util.Arrays;

/**
 * @author Su6z4o7
 *
 */
public class RandomNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int i = (int)Math.random();
		System.out.println(i);
		
		String str1 = "india";
		String str2 = "idnia";
		char[] ch1= str1.toCharArray();
		Arrays.sort(ch1);
		char[] ch2= str2.toCharArray();
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2))
		{
			System.out.println("Anangram");
		}
		else
		{
			System.out.println("not anagram");
		}
		}

}
