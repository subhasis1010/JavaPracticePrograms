/**
 * 
 */
package samplePrograms;

import java.util.Scanner;

/**Program to find the reverse of an integer
 * @author Su6z4o7
 *
 */
public class ReverseInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Enter number whose reverse needs to be determined");
		Scanner scan  = new Scanner(System.in);
		int number = scan.nextInt();		

		System.out.println("Reverse of the number is "+ numberReverse(number));
	}
	
	
	/*
	 * This is where the actual program logic exists,
	 * first identify the remainder then keep incrementing the reverse using the formula
	 */
	
	public static int numberReverse(int no)
	{
		int reverse = 0;
		int remainder = 0;
		
		do{
			remainder = no%10;
			reverse = reverse*10 + remainder;
			no = no/10;
		}
		while(no>0);
		
		return reverse;
	}

}
