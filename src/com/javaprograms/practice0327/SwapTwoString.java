/**
 * 
 */
package com.javaprograms.practice0327;

/**
 * @author Su6z4o7
 * Swap two string variables without using temp
 *
 */
public class SwapTwoString {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String str1 = "hello";
		String str2 = "world";
		System.out.println("before swapping strings are "+str1+"----"+str2);
		
		//add both the strings and make use of sub string method for this
		str1 = str1+str2;
		str2 = str1.substring(0, str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println("after swapping is "+str1+"----"+str2);
		
	}

}
