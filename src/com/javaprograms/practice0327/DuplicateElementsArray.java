/**
 * 
 */
package com.javaprograms.practice0327;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Su6z4o7
 * Find the duplicate elements in an array
 *
 */
public class DuplicateElementsArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] array = {43, 56, 200, 12, 22, 300, 500, 33, 57, 60, 100};
		int len = array.length;
		HashSet<Integer> hs = new HashSet();
		for(int i: array)
		{
			if(!hs.add(i))
			{
				System.out.println("duplicate is "+i);
			}
		}
		
		System.out.println(secondLargest(array));
		

	}

	private static int secondLargest(int[] array) 
	{
		int first = array[0];
		int second = array[1];
		for(int i=0;i<array.length;i++)
		{
			if(array[i] > first)
			{
				second = first;
				first = array[i];
				
			}
			else if(array[i] < first)
			{
				second = array[i];
			}
		}

		return second;
		
	}

}
