/**
 * Java program to find more than one missing number in an array
 * Working only when there are non two consecutive missing numbers
 */
package com.javaprograms.practice0608;

/**
 * @author Su6z4o7
 *
 */
public class MissingNumbers {

	/**
	 * @param args
	 */
	
	private static int position=0;
	private static int result=0;
	public static void main(String[] args) {
		int[] iArray = {1,2,4,5,6,9,10,11, 13};
		findMissing(iArray, position);

	}
	private static void findMissing(int[] a, int position) {
		for(int i=1;i<a.length-1;i++){
			result = a[i];
			if((result+1)!=a[i+1]){
				position = i+1;
				System.out.println("Missing no is "+(result+1));
			
			}
					
		}
		
	}

}
