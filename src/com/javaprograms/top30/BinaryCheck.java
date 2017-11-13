/**
 * 
 */
package com.javaprograms.top30;

import java.util.Scanner;

/**
 * @author Su6z4o7
 * 
 * Check if a number is binary i,e 1 or 0
 *
 */
public class BinaryCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Input the number to be checked if its binary");
		Scanner scan= new Scanner(System.in);
		int no = scan.nextInt();
		checkBinary(no);
		
		
	}

	private static void checkBinary(int no) 
	{
		int digit = 0;
		while(no!=0)
		{
			digit=no%10;
			if(digit == 0 || digit==1)
			{
				no = no/10;
			}
			else
			{
				System.out.println("not a binary no");
				break;
			}
			
		}
		if(no == 0)
		{
			System.out.println("its a binary no");
		}
		
	}

}
