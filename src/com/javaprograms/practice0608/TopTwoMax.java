/**
 * 
 */
package com.javaprograms.practice0608;

/**
 * @author Su6z4o7
 *
 */
public class TopTwoMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intArray = {20, 34, 100, 87, 10, 99};
		firstTwoMax(intArray);

	}

	private static void firstTwoMax(int[] iA) {
		int first = iA[0];
		int second = iA[1];
		
		for(int i=0;i<iA.length;i++){
			if(iA[i]>first){
				second = first;
				first=iA[i];	
			}
			else if(iA[i] > second){
				second = iA[i];
			}
		}
		System.out.println(first+"---"+second);
	}


}
