/**
 * 
 */
package com.javaprograms.practice0523;

import java.util.Scanner;

/**
 * @author Su6z4o7
 *
 */
public class PyramidCopy {

	/**Java program to print a pyramid
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter the number of rows in pyramid");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		
		for(int i=n;i>0;i--){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}

	}

}
