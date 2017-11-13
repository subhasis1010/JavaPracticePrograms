/**
 * Program to find if an array contains duplicates
 */
package com.javaprograms.top30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * @author Su6z4o7
 *
 */
public class DuplicateElementsPart2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		List<String> al = new ArrayList();
		al.add("one");
		al.add("two");
		al.add("three");
		al.add("four");
		System.out.println(checkDuplicates(al));
		
		List<String> list = (List<String>)Arrays.asList("may", "be", "one");
	}
	
	private static boolean checkDuplicates(List<String> l)
	{
		HashSet hs = new HashSet();
		Iterator<String> itr = l.iterator();
		
		while (itr.hasNext())
		{
			hs.add((String)itr.next());
		}
		
		if(hs.size() != l.size())
		{
			return true;
		}
		return false;
	}

}
