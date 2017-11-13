/**
 * 
 */
package com.javaprograms.top30;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Su6z4o7
 * Sort an array in descending order
 *
 */
public class SortingDescendingOrder 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		List<String> list = (List<String>)Arrays.asList("one", "Two", "three", "four");
		//Arrays.sort() - used to sort arrays
		// Collections.sort()  - used to sort list
		Collections.sort(list, String.CASE_INSENSITIVE_ORDER); // sort by ignoring the case sensitiveness of the words
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
	}
}
