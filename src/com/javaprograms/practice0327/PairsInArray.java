/**
 * Find All Pairs of Elements In An Array Whose Sum Is Equal To A Given Number?
 */
package com.javaprograms.practice0327;

/**
 * @author Su6z4o7
 *
 */
public class PairsInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] arrayInt = {2, 3, 5, 1, 4, 9};
		int givenNo = 6;
		for(int i=0;i<arrayInt.length-1;i++)
		{
			for(int j=i+1;j<arrayInt.length;j++)
			{
				int temp = arrayInt[i]+arrayInt[j];
				if(temp == givenNo)
				{
					System.out.println("Pairs are "+arrayInt[i]+" "+arrayInt[j]);
				}
						
			}
		}

	}

}
