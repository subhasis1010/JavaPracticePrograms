/**
 * 
 */
package com.javaprograms.practice0608;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**Find all pairs of integers whose sum is equal to given number
 * @author su6z4o7
 *
 */
public class PairsInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] iArray = {2, 6, 3, 9, 11};
		Scanner scan = new Scanner(System.in);
		int number=scan.nextInt();
		//HashMap<Integer,Integer> hm = new HashMap();
		
		for(int i=0;i<iArray.length;i++){
			for(int j=i+1;j<iArray.length;j++){
				if((iArray[i] + iArray[j])==number){
					System.out.println(iArray[i] +","+iArray[j]);
				}
			}
		}
		//we do not need a hashmap here
		/*
		Set<Integer> keys = hm.keySet();
		Iterator itr = keys.iterator();
		while(itr.hasNext()){
			System.out.println(hm.get(itr.next())+"**"+itr.next());
		}*/
		
	}

}
