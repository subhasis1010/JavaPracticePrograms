/**
 * Program to find the largest of three numbers
 */
package samplePrograms;

import java.util.Scanner;

/**
 * @author Su6z4o7
 *
 */
public class LargestNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Enter three numbers");
		Scanner scan = new Scanner(System.in);
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		int number3 = scan.nextInt();
		
		if(number1>number2 && number1>number3)
		{
			System.out.println("lagest no is "+number1);
		}
		else if(number2> number3)
		{
			System.out.println("largest no is "+number2);
		}
		else
		{
			System.out.println("largest no is "+number3);
		}

	}

}
