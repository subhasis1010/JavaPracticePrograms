/**
 * 
 */
package com.javaprograms.practice0523;

import java.util.Scanner;

/** Check if a number belongs to a fibonacci series
 * @author su6z4o7
 * 
 * Easier way is to use a while loop instead of a For loop
 *
 */
public class CheckFibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter the no to be checked");
		Scanner scan = new Scanner(System.in);
		int numberCheck = scan.nextInt();
		checkFibon(numberCheck);	
	}

	private static void checkFibon(int numberCheck) {
		int first=0;
		int second=1;
		int fibonacci=0;
				
		while(fibonacci<numberCheck)
		{
			fibonacci=first+second;
			first=second;
			second=fibonacci;
			
		}
		if(fibonacci == numberCheck)
		{
			System.out.println("number is part of a fibonacci series "+fibonacci);
		}
		else
		{
			System.out.println("number is not part of a fibonacci series");
		}
	}

}
