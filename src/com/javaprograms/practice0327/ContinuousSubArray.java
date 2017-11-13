/**
 * Find The Continuous Sub Array In An Array Whose Sum Is Equal To Given Number
 */
package com.javaprograms.practice0327;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Su6z4o7
 *
 */
public class ContinuousSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] noArray = {12, 5, 6, 9, 21, 8,12};
		int givenNo = 20;
		int sum = noArray[0];
		int start = 0;
		for(int i=1;i<noArray.length;i++)
		{
			sum = sum+noArray[i];
			
			//if sum is greater than input no, loop is executed until sum becomes smaller than or equal to given No
			while(sum > givenNo && start < i-1)
			{
				//removing starting elements from sum
				sum = sum - noArray[start];
				start ++;
			}
			
			if(sum == givenNo)
			{
				System.out.println("continuos sub array of "+Arrays.toString(noArray)+" whose sum is "+givenNo+ " is ");
				for(int j=start;j<=i;j++)
				{
					System.out.print(noArray[j]+" ");
				}
				System.out.println("\n");
			}
			
			
			
		}
		

	}

}
