/**
 * Program to find pairs in arrays of integers
 */
package com.javaprograms.top30;

import java.util.ArrayList;

/**
 * @author Su6z4o7
 *
 */
public class PairsInArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] iArray = {2, 6, 3, 9, 11, 5, 4};
		int sum = 9;
		for(int i=0;i<iArray.length
				;i++)
		{
			int first = iArray[i];
			for(int j=i+1;j<iArray.length;j++)
			{
				int second = iArray[j];	
				
				if((first+second)== sum)
				{
					// format the output
					System.out.printf("(%d, %d) %n", first, second);
				}
			}
		}

	}

}
