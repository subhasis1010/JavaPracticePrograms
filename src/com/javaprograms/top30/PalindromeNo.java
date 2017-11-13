/**
 * 
 */
package com.javaprograms.top30;

import java.util.Scanner;

/**
 * @author Su6z4o7
 * Program to check palindrome no
 */
public class PalindromeNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Input the number which needs to be checked");
		Scanner scan= new Scanner(System.in);
		int no = scan.nextInt();
		if(no == checkPalindrome(no))
		{
			System.out.println("its a palindrome no");
		}
		else
		{
			System.out.println("not a palindrome no");
		}

	}

	private static int checkPalindrome(int no) 
	{
		int reverse = 0;
		while(no !=0)
		{
			reverse = reverse*10 + no%10;
			no=no/10;
		}
		
	return reverse;
	}

}
