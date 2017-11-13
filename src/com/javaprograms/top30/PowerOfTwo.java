/**
 * 
 */
package com.javaprograms.top30;

import java.util.Scanner;

/**
 * @author Su6z4o7
 * Check if the integer no is power of two
 * this is developed using brute force where an integer variable is converted to double
 * later Math.Pow method is used to enable this
 */
public class PowerOfTwo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Input the number which needs to be checked");
		Scanner scan= new Scanner(System.in);
		int no = scan.nextInt();
		checkPower(no);
	}

	private static void checkPower(int no) 
	{
		int count=0;
		double d = (double) no;
		for(double i=1;i<=no;i++)
		{
			if(Math.pow(2, i)==no)
			{
				count++;
				break;
			}
			
		}
		if(count== 0){
			System.out.println("number "+no+" is not a power of 2");
		}
		else{
			System.out.println("number "+no+" is  a power of 2");
		}
		
		//System.out.println(Math.pow(2, i));	
	}
}
