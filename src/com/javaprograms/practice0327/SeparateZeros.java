/**
 * 
 */
package com.javaprograms.practice0327;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Su6z4o7
 * Separate zeros from the array for Ex {14, 0, 5, 2, 0, 3, 0} should be {14, 5, 2, 3, 0, 0, 0}
 *
 */
public class SeparateZeros {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] array =  {14, 0, 5, 2, 0, 3, 0};
		/*ArrayList<Integer> al = new ArrayList();
		int count = 0;
		for(int i=0;i<array.length;i++)
		{
			if (array[i]==0)
			{
				count++;
			}
		}
		System.out.println(count);
		*/
		
		int counter=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]!=0)
			{
				array[counter] = array[i];
				counter++;
			}
		}
		int counter1 = counter;
		while(counter<array.length)
		{
			array[counter]=0;
			counter++;
		}
		System.out.println(Arrays.toString(array));
		
		//Now for adding zeros in beginning
		
		}

}
