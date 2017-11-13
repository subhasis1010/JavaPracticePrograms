/**
 * Program to find the pairs in an array
 */
package com.javaprograms.practice0608;

/**
 * @author Su6z4o7
 *
 */
public class PairsArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] iArray = {2, 6, 3, 9, 11, 5, 4};
		int sum = 9;
		
		for(int i=0;i<iArray.length-1;i++){
			int first = iArray[i];
			for(int j=i+1;j<iArray.length;j++){
				int second = iArray[j];
				if((first+second) == sum){
					System.out.printf("(%d, %d) %n", first, second);
				}
			}
		}

	}

}
