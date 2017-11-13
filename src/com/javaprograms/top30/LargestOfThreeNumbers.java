/**
 * 
 */
package com.javaprograms.top30;

import java.util.Scanner;

/**
 * @author Su6z4o7
 * Program to find the largest of three numbers
 *
 */
public class LargestOfThreeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Input the numbers to find which one is the largest");
		Scanner scan= new Scanner(System.in);
		int no1 = scan.nextInt();
		int no2 = scan.nextInt();
		int no3 = scan.nextInt();
		System.out.println("Largest of three numbers is "+largestNumber(no1, no2, no3));
	}

	private static int largestNumber(int no1, int no2, int no3) 
	{
		if(no1 > no2 && no1 > no3)
		{
			return no1;
		}
		else if(no2>no1 && no2>no3)
		{
			return no2;
		}
		else
		{
			return no3;
		}
	}

}
