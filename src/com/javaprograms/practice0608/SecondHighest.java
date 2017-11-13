/**
 * Find the highest and second highest number in the array with and without using Arrays.Sort
 */
package com.javaprograms.practice0608;

import java.util.Arrays;

/**
 * @author su6z4o7
 *
 */
public class SecondHighest {

	/**
	 * @param args
	 */
	static int[] iArray = {43, 33, 12, 99, 90, 33, 7, 100};
	static int no=0;
	static int first= 0;
	static int second = 0;
	public static void main(String[] args) {
		System.out.println();
		secondWithSort(iArray);
		secondWithoutSort(iArray);
	}
	private static void secondWithoutSort(int[] iArray2) {
		first = iArray[0];
		second = iArray[1];
		for(int i=2;i<iArray.length;i++){
			if(first<iArray[i]){
				second = first;
				first = iArray[i];
				
			}
			else if(iArray[i]>second){
				second = iArray[i];
			}
		}
		System.out.println(first +"  "+second);
	}
	private static void secondWithSort(int[] iArray2) {
		
		Arrays.sort(iArray2);
		System.out.println(iArray2[1]);
		
	}

}
