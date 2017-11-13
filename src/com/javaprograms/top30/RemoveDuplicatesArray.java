/**
 * INCOMPLETE
 */
package com.javaprograms.top30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author Su6z4o7
 * Program to remove duplicates from an integer array
 * First try with using collections API then without collections API -- 
 * solved using collection API
 */
public class RemoveDuplicatesArray 
{
	/**
	 * @param args
	 */
	static int[] iArray = {43, 33, 12, 99, 90, 33, 7, 33};
	
	public static void main(String[] args) 
	{
		//Arrays.sort(iArray);
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for(int i=0;i<iArray.length;i++)
		{
			ll.add(iArray[i]);
		}
		//System.out.println(ll);
		//System.out.println(Arrays.toString(removeDuplicates(iArray)));
		removeDuplicates(iArray);
	}
	
	private static void removeDuplicates(int[] array)
	{
		Arrays.sort(array);
		System.out.println("Sorted array is "+Arrays.toString(array));
		Set set =new HashSet();
		for(int i=0;i<array.length;i++)
		{
			set.add(array[i]);
		}
		System.out.println("array without duplicates is "+set);
		
		
	}

}
