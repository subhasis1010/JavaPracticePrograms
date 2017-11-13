/**
 * 
 */
package com.javaprograms.practice0523;

import java.util.Scanner;

/** Program to print a pyramid
 * @author Su6z4o7
 * INCOMPLETE
 */
public class Pyramid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("enter the number of rows in pyramid");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int rowCount=1;
		System.out.println("here is the pyramid");
		//String str = "here ss   is";
		//System.out.println(str.replaceAll("\\s", ""));
		
		for(int i=n;i>0;i--)
		{
			//print spaces at the beginning of each row
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			//printing row count at each row
			for(int j=1;j<=rowCount;j++)
			{
				System.out.print(rowCount+" ");
			}
			System.out.println();
			//increment the row
			rowCount++;
		}

	}

}
