/**
 * 
 */
package com.javaprograms.practice0608;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**Remove duplicates from an integer array without using collections
 * @author su6z4o7
 *Program is easier to derive using collection class not tried without collections API
 */
public class RemoveDuplicatesArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intArray = {1, 1, 2, 2, 3, 4, 5};
		Set<Integer> set = new HashSet<Integer>();
		for(int i =0;i<intArray.length;i++){
			set.add(intArray[i]);
		}
		System.out.println(set);
	}

}
