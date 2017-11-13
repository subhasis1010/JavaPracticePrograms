/**
 * This program is not working, will have to check this
 */
package com.javaprograms.practice0327;

/**
 * @author su6z4o7
 * 
 * Selection sort algorith - Complexity is O(n2), iterate each time and find the smallest element
 * there are two for loops so n2 iterations would eventually sort the array
 *
 */
public class SelectionSort 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] arrayUnSorted = {23, 45, 66, 2, 25, 55, 10, 12, 33};
		System.out.println("Before Sorting array is");
		for(int i:arrayUnSorted)
		{
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
		int[] sortedArray = selectionSort(arrayUnSorted);
		System.out.println("Sorted array is: ");
		for(int j:sortedArray)
		{
			System.out.print(j);
			System.out.print(" ");
		}
		
	}

	private static int[] selectionSort(int[] arrayUnSorted) 
	{
		int length = arrayUnSorted.length;
		for(int i=0;i<length-1;i++)
		{
			int index = i;
			for(int j=i+1;j<length;j++)
			{
				  if (arrayUnSorted[j] < arrayUnSorted[index])
				  {
					  index = j;  
				  }
			}
			//swapping the two numbers only the position specific where there is a difference
			int temp = arrayUnSorted[i];
			arrayUnSorted[i]= arrayUnSorted[index];
			arrayUnSorted[index] = temp;	           	
		}
		return arrayUnSorted;
	}

}
