/**
 * 
 */
package com.javaprograms.top30;

import java.util.Scanner;

/**
 * @author Su6z4o7
 *
 */
public class FactorialNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
	System.out.println("Input the number which needs to be checked");
	Scanner scan= new Scanner(System.in);
	int no = scan.nextInt();	
	
	System.out.println("Factorial of the number is "+factorial(no));
	}

	private static int factorial(int no) 
	{
		int fact = 1;
		for(int i=1;i<=no;i++)
		{
			fact = fact*i;
		}
		return fact;
	}

}
