/**
 * Find prime factors of a given number. For Ex if you enter 45, it should return 3 and 5
 * Fixed the issues in Bart
 */
package com.javaprograms.practice0608;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Su6z4o7
 *
 */
public class PrimeFactorsNew {
	/**
	 * @param args
	 */
	static int noToCheck = 0;
	static int count = 0;
	public static void main(String[] args) {
		System.out.print("Enter the no whose prime factors needs to be determined -> ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		factors(number);

	}

	private static void factors(int number) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=2;i<=number;i++){
			if(number%i == 0){
				al.add(i);
			}
		}
		System.out.println("Regular factors are "+al);
		System.out.println("Prime factors are "+primeNo(al));
	}

	private static ArrayList<Integer> primeNo(ArrayList al) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i=0;i<al.size();i++){
			noToCheck = (int) al.get(i);
			count=0;
			for(int j=1;j<=noToCheck;j++){
				if(noToCheck%j == 0){
					count ++;
				}
			}
			if(count == 2){
				res.add(noToCheck);
			}
			}
		return res;	
		
	}
	
	
	
	

}
