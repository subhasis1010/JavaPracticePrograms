/**
 * 
 */
package com.javaprograms.top30;

import java.util.Scanner;

/**
 * @author Su6z4o7
 * Program to find the sum of digits of a number using recursion
 *	
 */
public class SumOfDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Input the number whose sum of digits needs to be determined");
		Scanner scan= new Scanner(System.in);
		int no = scan.nextInt();
		sumOfDigits(no);
		swap(23, 34);
		
	}

	private static void sumOfDigits(int no) 
	{
		int digits = 0;
		while(no!=0)
		{
			digits = digits + (no%10);
			no = no/10;
		}
		System.out.println("sum of all the digits is "+ digits);
	}
	
	private static void swap(int a, int b)
	{
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println(a+"  "+b);
		
	}
	


}
