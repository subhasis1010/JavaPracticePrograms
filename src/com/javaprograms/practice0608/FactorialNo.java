/**
 * 
 */
package com.javaprograms.practice0608;

import java.util.Scanner;

/**Program to find the factorial of a number
 * @author su6z4o7
 *
 */
public class FactorialNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter no whose factorial is to be determined");
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		System.out.println(fact(no));
	}

	private static int fact(int no) {
		int result = 1;
		for(int i=no;i>0;i--){
			result = result*i;
		}
		return result;
		
	}

}
