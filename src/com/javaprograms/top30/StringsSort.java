/**
 * sort the list of strings using java collections
 */
package com.javaprograms.top30;

import java.util.Arrays;

/**
 * @author Su6z4o7
 *
 */
public class StringsSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String[] strList = {"jan", "feb", "mar", "apr","may","jun"};
		
		// arrays.sort would automatically sort in alphabetic order, need to learn the recursive method
		Arrays.sort(strList, String.CASE_INSENSITIVE_ORDER); // this is the sorting mechanism which is implemented here
		for(String str:strList)
		{
			System.out.println(str);
		}
	}

}
