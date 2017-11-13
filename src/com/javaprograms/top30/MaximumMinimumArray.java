/**
 * 
 */
package com.javaprograms.top30;

/**
 * Write a program to find the maximum and minimum in an array
 * @author Su6z4o7
 *
 */
public class MaximumMinimumArray 
{

	/**
	 * @param args
	 */
	
	static int[] iArray = {43, 200, -33, 12, 99, 90, 33, 7};
	
	public static void main(String[] args) 
	{
		System.out.println("Largest and smallest numbers are "+maximum(iArray)+"******"+minimum(iArray));

	}
	//separately implementing the maximum and mininum methods
	private static int maximum(int[] array)
	{
		int max = array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i] > max)
			{
				max = array[i];
			}
		}
		return max;
	}
	private static int minimum(int[] array)
	{
		int min = array[0];
		for(int i=0;i<array.length;i++)
		{
			if(array[i] < min)
			{
				min = array[i];
			}
		}
		return min;
	}

}
