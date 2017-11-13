/**
 * 
 */
package samplePrograms;

import java.util.Scanner;

/**
 * Find the sum of digits of a number
 * @author Su6z4o7
 *
 */
public class SumofDigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Enter number whose reverse needs to be determined");
		Scanner scan  = new Scanner(System.in);
		int number = scan.nextInt();	
		System.out.println("Reverse of the number is "+ sumofDigits(number));
	}
	
	public static int sumofDigits(int no)
	{
		int sum = 0;
		
		while(no>0)
		{
			sum = sum+no%10;
			no = no/10;
		}
		
		return sum;
	}
}
