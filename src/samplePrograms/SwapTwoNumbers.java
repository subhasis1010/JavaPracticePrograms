/**
 * Program to swap two numbers without using temp variable
 */
package samplePrograms;

import java.util.Scanner;

/**
 * @author Su6z4o7
 *
 */
public class SwapTwoNumbers 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Enter two numbers");
		Scanner scan = new Scanner(System.in);
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		System.out.println("Numbers without swapping are "+number1+"-----"+number2);
		/*
		 * number1=number1+number2;
		 * number2 = number1 - number2;
			number1 = number1-number2;
			System.out.println("Numbers after swapping are "+number1+"-----"+number2);
		 */
		//try using division and multiplication
		number1 = number1*number2;
		number2 = number1/number2;
		number1 = number1/number2;
		System.out.println("Numbers after swapping are "+number1+"-----"+number2);
		
		
	}
	
	
}
