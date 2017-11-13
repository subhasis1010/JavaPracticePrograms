/**
 * 
 */
package com.javaprograms.practice0327;

/**
 * @author Su6z4o7
 * An element is said to be leader if all the elements on it’s right side are smaller than it. 
 * Rightmost element is always a leader.
 */
public class LeadersInteger 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] array = {14, 9, 11, 7, 8, 5, 3};
		int length = array.length;
		//first consider the right most element which is always the leader
		int max = array[length-1];
		System.out.println("the elements which are leader are: ");
		System.out.println(max);
		
		//start traversing the array in reverse order
		
		for(int i=length-2;i>=0;i--)
		{
			if(array[i]>max)
			{
				System.out.println(array[i]);
				max = array[i];
			}
		}
	}
}
