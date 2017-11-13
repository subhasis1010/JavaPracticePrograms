/**
 * 
 */
package com.javaprograms.top30;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Su6z4o7
 * 
 * Program to find the fibonacci series 1, 1, 2, 3, 5, 8,...
 *
 */
public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Input the length of fibonacci series");
		Scanner scan= new Scanner(System.in);
		int no = scan.nextInt();
		findFibonacci(no);
	}

	private static void findFibonacci(int no) 
	{
		int fibonacci = 0;
		int first = 0;
		int second = 1;
		System.out.print(second+" ");
		for(int i=1;i<=no;i++)
		{
			fibonacci = first+second;
			System.out.print(fibonacci+" ");
			first = second;
			second = fibonacci;
		}	
	}
}
