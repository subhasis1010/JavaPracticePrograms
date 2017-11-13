/**
 * How to Find Missing Number on Integer Array of 1 to 100
 */
package com.javaprograms.top30;

import java.util.Iterator;

/**
 * @author Su6z4o7
 *
 */
public class MissingNo 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] iArray = {1,2,3,5};
		// use the sum of n numbers formula
		//sum = n(n+1)/2
		int sum = 5*(5+1)/2;
		System.out.println(sum);
		int count=0;
		for(int i=0;i<iArray.length;i++)
		{
			count=count+iArray[i];
		}
		System.out.println(count);
		
		System.out.println("missing number is "+(sum-count));

	}

}
