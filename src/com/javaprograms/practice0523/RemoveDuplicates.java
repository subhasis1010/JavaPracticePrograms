/**
 * 
 */
package com.javaprograms.practice0523;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/** Filter duplicate elements from an array and print as a List
 * @author Su6z4o7
 *
 */
public class RemoveDuplicates {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		// insert no 0-9 to the array
		for(int i=0;i<=9;i++)
		{
			al.add(String.valueOf(i));
		}
		
		// insert no 0-5 to the array
				for(int i=0;i<=5;i++)
				{
					al.add(String.valueOf(i));
				}
		
		Set<String> hs = new HashSet();
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			hs.add(itr.next());
		}
		
		System.out.println("after conversion is \n"+hs);
		
		
		String[] inputList = { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
				"aug", "Sep", "Oct", "nov", "Dec" };
		
		// Soring of arrays in insensitive order
		Arrays.sort(inputList, String.CASE_INSENSITIVE_ORDER);
		for(int i=0;i<inputList.length;i++)
		{
			System.out.println(inputList[i]);
		}
		

	}

}
