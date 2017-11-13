/**
 * Input a number and determine if its a power of two
 */
package com.javaprograms.practice0608;

import java.util.Scanner;

/**
 * @author Su6z4o7
 *
 */
public class PowerOfTwo {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		
		findPowerOfTwo(no);

	}

	private static void findPowerOfTwo(int n) {
		int count=0;
		for(int i=1;i<n/2;i++){
			if(Math.pow(2, i) == n){
				count++;
			}
		}
		if(count==0){
			System.out.println("Not a power of two");
		}
		else{
			System.out.println("number is a power of two");
		}
		
	}

}
