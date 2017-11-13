/**
 * 
 */
package samplePrograms;

import java.util.Arrays;
import java.util.Collections;

/**Identify second highest no in an array using different methods
 * @author Su6z4o7
 *
 */
public class SecondHighestNo {

	/**
	 * @param args
	 */
	static int[] array1 = {20, 34, 21, 87, 92, 25};
	static int len = array1.length;
	public static void main(String[] args) 
	{
		arraysSort();
	}
	/*
	 * Using arrays.sort
	 */
	public static void arraysSort()
	{
		Arrays.sort(array1);
		System.out.println(array1[len-2]);
		
	}
	
	/*Running a for loop
	 * 
	 */

}
