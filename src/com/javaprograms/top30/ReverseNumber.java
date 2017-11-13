/**
 * 
 */
package com.javaprograms.top30;

import java.util.Scanner;

/**
 * @author Su6z4o7
 *
 */
public class ReverseNumber {

	/**
	 * @param args
	 */
	
	static int number = 0;
	public static void main(String[] args) 
	{
	 System.out.println("Enter a number whose revese needs to be determined");
	 Scanner scan = new Scanner(System.in);
	 
	try {
		number = scan.nextInt();
	} catch (Exception e) 
	{
		System.out.println("Enter only numbers");
	}
	 //System.out.println(reverseNumber(number));
	System.out.println(reverseNo(number));
	}
	
	private static int reverseNo(int number)
	{
		int reverse = 0;
		while(number!=0)
		{
			reverse = reverse*10 + number%10;
			number = number/10;
		}
		
		return reverse;
		
	}

	private static int reverseNumber(int number) 
	{
		
		double reverse = 0;
		int remainder=0;
		while(number>0)
			{
			for(int i=2;i>=0;i--)
			{
				remainder = number%10;
				reverse = reverse+(remainder*Math.pow(10, i));
				number = number/10;	
			}
			
			}

		return (int)reverse;
		
	}

}
