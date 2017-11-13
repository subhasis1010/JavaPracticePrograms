/**
 * Second Highest No in integer array
 */
package com.javaprograms.top30;

import java.util.Arrays;

/**
 * @author Su6z4o7
 *
 */
public class SecondHighest {

	/**
	 * @param args
	 */
	static int[] iArray = {20, 34, 21, 87, 92, 25, 33, 43, 12, 49};
	static int length = iArray.length;
	public static void main(String[] args) 
	{
		System.out.println("second highest no is "+secondHighest(iArray));
		System.out.println("second highest no is "+secondHighestRecur(iArray));
	}
	
	//using sort program
	private static int secondHighest(int[] array)
	{
		
		Arrays.sort(array);
		return array[length-2];
	}
	
	//using recursive method
	private static int secondHighestRecur(int[] array)
	{
		int largest = array[0];
		int secondLargest = array[1];
		
		for(int i=1;i<length;i++)
		{
			if(array[i] > largest)
			{
				secondLargest = largest;
				largest = array[i];
				
			}
			else if(array[i] < largest)
			{
				secondLargest = array[i];
			}
		}
		
		
		return secondLargest;
		
	}

}
