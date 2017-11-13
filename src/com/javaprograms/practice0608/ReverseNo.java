/**
 * program to find the reverse of a number
 */
package com.javaprograms.practice0608;

import java.util.Scanner;

/**
 * @author su6z4o7
 *
 */
public class ReverseNo {

	/**
	 * @param args
	 */
	static int reverse = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		System.out.println("Reverse of the number is "+reverse(number));
	}

	private static int reverse(int number) {
		while(number>0){
			reverse = reverse*10 + number%10;
			number = number/10;
		}
		
		return reverse;
	}

}
