/**
 * 
 */
package com.javaprograms.practice0608;

import java.util.Scanner;

/**Check if a given no is binary or not (Comprising of 1 or 0)
 * @author su6z4o7
 *
 */
public class BinaryCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.print("Enter the no which needs to be determined -> ");
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		if(check(no)){
			System.out.println("its a binary");
		}
		else{
			System.out.println("not a binary");
		}
	}

	private static boolean check(int no) {
		int digit = 0;
		while(no!=0){
			digit = no%10;
			if(digit == 0 || digit == 1){
				no = no/10;
			}
			else{
				return false;
			}
		}
		return true;
		
	}

}
