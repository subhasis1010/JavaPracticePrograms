/**
 * Java program to check if a number is Armstrong or not
 */
package samplePrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Su6z4o7
 *
 */
public class ArmstrongNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Enter the no which needs to be checked");
		Scanner scan = new Scanner(System.in);
		int numberToCheck = scan.nextInt();
		checkArmstrong(numberToCheck);
	}
	
	private static void checkArmstrong(int no)
	{
		int original = no;
		int count = 0;
		int remainder = 0;
		while(no>0)
		{
			remainder = no%10;
			count = count + (remainder*remainder*remainder);
			no = no/10;
		}
		if(count == original)
		{
			System.out.println("its an armstrong no");
		}
		else
		{
			System.out.println("Not an armstrong no");
		}	
	}
}
