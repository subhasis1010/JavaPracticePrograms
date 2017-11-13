/**
 * 
 */
package com.javaprograms.practice0608;

/**
 * Write a program to find the maximum and minimum number in an array
 * @author Su6z4o7
 *
 */
public class MaximumMinimumArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] iArray = {43, 200, 33, 12, 300, 90, 33, 1};
		
		System.out.println("Largest no in array is " +largestNo(iArray));
		System.out.println("Smallest no in array is " +smallestNo(iArray));
	}

	private static int smallestNo(int[] iArray) {
		int smallest = iArray[0];
		for(int i=1;i<iArray.length;i++){
			if(smallest>iArray[i]){
				smallest = iArray[i];
			}
		}
		return smallest;
	}

	private static int largestNo(int[] iArray) {
		int largest = iArray[0];
		for(int i=1;i<iArray.length;i++){
			if(iArray[i]>largest){
				largest = iArray[i];
			}
		}
		return largest;
		
	}

}
