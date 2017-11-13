/**
 * Filter duplicate elements in an array and print in a list
 */
package com.javaprograms.top30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author Su6z4o7
 *
 */
public class DuplicateElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList();
		al.add("test");
		al.add("baq");
		al.add("sit");
		al.add("baq");
		al.add("test");
		al.add("bart");
		
		HashSet<String> hs = new HashSet<String>();
		System.out.println(al);

		System.out.println("String wthout duplicates");
		Iterator itr = al.iterator();
		
		// since set cannot contain duplicates, we will run the array list iterator in set and print the results 
		while(itr.hasNext())
		{
			hs.add((String) itr.next());	// we need to typecast the iterator to string and enable it to be added into the hashset
		}
		System.out.println(hs);
		
		if(al.size()>hs.size())
		{
			System.out.println("array contains duplicates");
		}
		else
		{
			System.out.println("doesn't contains duplicates");
		}
	}

}
