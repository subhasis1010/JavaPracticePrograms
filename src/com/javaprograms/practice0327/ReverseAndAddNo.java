/**
 * Reverse and add the no until you get a palindrome
 */
package com.javaprograms.practice0327;

import java.util.Scanner;

/**
 * @author Su6z4o7
 *
 */
public class ReverseAndAddNo 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner scan1 = new Scanner(System.in);
		int number1 = scan1.nextInt();
		int palindrome = numberReverse(number1)+number1;
		while(checkPalindrome(palindrome)==false)
			{
				palindrome = palindrome+numberReverse(palindrome);
			}
		System.out.println("its a palindrome number "+palindrome);
	}

	private static boolean checkPalindrome(int palindrome) 
	{
		if(palindrome == numberReverse(palindrome))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	private static int numberReverse(int no) 
	{
		int reverse = 0;
		while(no>0)
		{
			reverse = reverse*10 + no%10;
			no=no/10;
		}

		return reverse;
		
	}

}
