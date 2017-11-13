/** 
 */
package com.javaprograms.pracice0911;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/**
 * Program to create a partial pyramid
 * @author su6z4o7
 *
 */
public class partialPyramid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		printPyramid(number);

	}

	private static void printPyramid(int number) {
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(1);
			}
			System.out.println();
		}
	}

}
