/**
 * 
 */
package com.javaprograms.practice0327;

/**
 * @author Su6z4o7
 * Reverse an array in java
 */
public class ArrayReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] inputArray = {22, 11, 10, 15, 20, 18, 33, 44};
		int temp= 0;
		for(int i=0;i<inputArray.length/2;i++)
		{
			//swap the elements
			temp = inputArray[i];
			inputArray[i] = inputArray[inputArray.length-1-i];
			inputArray[inputArray.length-1-i] = temp;			
		}
		for(int a:inputArray)
		{
			System.out.print(a+" ");
		}
			
	}

}
