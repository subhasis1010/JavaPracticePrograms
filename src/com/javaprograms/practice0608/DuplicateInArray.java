package com.javaprograms.practice0608;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 */

/** In an array from 1-100 find the one duplicate element.
 * @author Su6z4o7
 *
 */
public class DuplicateInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[] strArray = {"one", "two", "three", "two", "four", "one", "five", "six"};
		Set<String> set = new HashSet<String>();
		Set<String> setDup = new HashSet<String>();
		for(int i=0;i<strArray.length;i++)
		{
			if(!set.contains(strArray[i])){
				set.add(strArray[i]);
			}
			else{
				setDup.add(strArray[i]);
			}
		}
		System.out.println("Duplicate elements are -> "+setDup);
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+" ");
		}
		
		

	}

}
