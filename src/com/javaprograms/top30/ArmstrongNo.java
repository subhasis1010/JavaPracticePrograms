/**
 * 
 */
package com.javaprograms.top30;

import java.util.Scanner;

/**
 * @author Su6z4o7
 *	Program to check for Armstrong No
 * slightly different implementation where multiple functions have been created
 */
public class ArmstrongNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Input the number which needs to be checked");
		Scanner scan= new Scanner(System.in);
		int no = scan.nextInt();
		
		if(no == checkArmstrong(no))
		{
			System.out.println("Its an armstrong no");
		}
		else
		{
			System.out.println("its not an armstrong no");
		}
	}

	private static int checkArmstrong(int no) 
	{
		int remainder=0;
		int result = 0;
		while(no!=0)
		{
			remainder = no%10;
			result = result + findSquare(remainder);
			no = no/10;
		}
		
		return result;
	}
	
	private static int findSquare(int no)
	{
		no = no*no*no;
		return no;
		
	}

}
