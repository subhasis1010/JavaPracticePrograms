/**
 * Write a Java program that prints the numbers from 1 to 50. 
 * But for multiples of three print “Fizz”instead of the number and for the multiples of five print “Buzz”. 
 * For numbers which are multiples of both three and five print “FizzBuzz”
 */
package com.javaprograms.top30;

/**
 * @author Su6z4o7
 *
 */
public class Fizzbuzz 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int number = 50;
		
		for(int i=1;i<=number;i++)
		{
			if(i%(5*3) == 0) // trick here is to always check for the larger number first then look for smaller ones
			{
				System.out.println(i+" FizzBuzz");
			}
			else if(i%5 == 0)
			{
				System.out.println(i+" Buzz");
			}
			else if(i%3 == 0)
			{
				System.out.println(i+" Fizz");
			}
		}

	}

}
