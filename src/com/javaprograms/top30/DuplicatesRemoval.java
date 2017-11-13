/**
 * 
 */
package com.javaprograms.top30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author Su6z4o7
 * Program to remove duplicates and maintain insertion order
 *
 *
 */
public class DuplicatesRemoval {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		List<String> duplicateList = (List<String>)Arrays.asList("one", "two","three", "one");
		System.out.println("Original list with duplicates");
		System.out.println(duplicateList);
		
		LinkedHashSet<String> newSet = new LinkedHashSet(duplicateList);
		List<String> withoutDuplicate = new ArrayList(newSet);
		System.out.println("without duplicates and insertion order list");
		System.out.println(withoutDuplicate);
	}

}
