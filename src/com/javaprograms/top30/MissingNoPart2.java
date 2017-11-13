/**
 * Find Multiple missing numbers in a number array
 * array is from 1 to 10
 */
package com.javaprograms.top30;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Su6z4o7
 *
 */
public class MissingNoPart2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int[] iArray = {1,2,3,5,6,9,10};
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<iArray.length;i++){
			al.add(iArray[i]);
		}
		int lastNo = iArray[iArray.length-1];
		
		missingNumbers(al, lastNo);
		

	}

	private static void missingNumbers(ArrayList al, int lastNo) {
		
		//build a new array
		ArrayList<Integer> alNew = new ArrayList();
		for(int i=1;i<=lastNo;i++){
			alNew.add(i);
		}
		System.out.println(alNew);
		System.out.println(al);
		//so now we have two arraylist and we need to compare then side by side
		ArrayList<Integer> alRes = new ArrayList<>();
		
		
		
		
	}

}
