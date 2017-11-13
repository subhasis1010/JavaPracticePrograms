/**
 * 
 */
package com.javaprograms.practice0608;

import java.util.ArrayList;
import java.util.Scanner;

/** Find all the prime factors of a given number
 * @author Su6z4o7
 *
 */
public class PrimeFactors {

	/**
	 * @param args
	 */
	static int count = 0;
	public static void main(String[] args) {
		System.out.print("Enter the no whose prime factors needs to be determined -> ");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println("Prime factors of number "+number+" are "+primeFactor(number));

	}

	@SuppressWarnings("rawtypes")
	private static ArrayList<Integer> primeFactor(int no) {
		ArrayList<Integer> al = new ArrayList();
		for(int i=2;i<no;i++){
			if(no%i==0){
				if(primeNo(i)){
					al.add(i);
				}
				
			}
			}
		return al;	
	}
	
	public static boolean primeNo(int no){
		
		for(int i=2;i<=no;i++){
			if(no%i == 0){
				count++;
			}
		}
		if(count==2){
			return true;
		}
		else{
			return false;
		}
	}

}
