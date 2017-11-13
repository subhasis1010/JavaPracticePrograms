/**
 * How to find the factorial of a number
 */
package samplePrograms;

import java.util.Scanner;

/**
 * @author Su6z4o7
 *
 */
public class FactorialNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("enter the number whose factorial series has to be determined");
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int factorial = 1;
		for(int i=1;i<=n;i++)
		{
			factorial = factorial*i;			
		}
		System.out.println(factorial);
	}

}
