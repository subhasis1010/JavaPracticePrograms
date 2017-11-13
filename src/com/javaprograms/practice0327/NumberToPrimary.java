/**
 * 
 */
package com.javaprograms.practice0327;

import java.util.Scanner;

/**
 * @author Su6z4o7
 * Convert no to primary
 *
 */
public class NumberToPrimary {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the no whose binary equivalent is to be determined");
		int number = scan.nextInt();
		int noPrint = number;
		String binary = "";
		int rem = 0;
		//this is the actual logic for doing the conversion to binary
		while(number>0)
		{
			rem = number%2;
			binary = rem+binary;
			number = number/2;
		}
		System.out.println("Binary equivalent of "+noPrint+" is "+binary);

	}

}
