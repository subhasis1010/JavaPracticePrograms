/**
 * Accepts a number from the user and checks if the number is prime and displays the result on the screen
 */
package com.javaprograms.top30;

import java.util.Scanner;

import org.apache.xerces.util.SynchronizedSymbolTable;

/**
 * @author Su6z4o7
 *
 */
public class FindPrimeNumbers 
{

	/**
	 * @param args
	 */
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the number to check");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		checkPrimeNo(number);
		
		StringBuffer sb = new StringBuffer();
		sb = null;
		
		//System.gc();
	
	}
	public void finalize()
	{
		System.out.println("garbage collection method is called");
	}


	private static void checkPrimeNo(int number) 
	{
		int count =0;
		
		for(int i=1;i<=number;i++)
		{
			if(number%i == 0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			System.out.println(number+" is a prime no");
		}
		else
		{
			System.out.println(number+" is not a prime no");
		}
		
	}
	
	
	

}
