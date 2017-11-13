/**
 * 
 */
package com.javaprograms.practice0523;

import java.util.Scanner;

/**Check if a number is prime number or not
 * @author Su6z4o7
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		System.out.println(primeNoCheck(no));
	}

	private static boolean primeNoCheck(int no) {
		int count = 0;
		for(int i=1;i<=no;i++)
		{
			if(no%i == 0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			return true;
		}
		else{
			return false;
		}
		
	}

}
