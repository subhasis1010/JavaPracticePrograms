/**
 * 
 */
package com.javaprograms.top30;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Su6z4o7
 * Program to find the prime factors of a given number
 * We start from 2, because that's the first prime number and every number is also divisible by 1, then we iterate until we find a prime factor by incrementing and stepping one at a time. 
 * When we find a prime factor, we store it inside a Set and also reduce the number till which we are looping.
 * Coped from original, need to practice
 *
 */
public class PrimeFactors {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Input the number whose prime factor is to be determined");
		Scanner scan= new Scanner(System.in);
		int no = scan.nextInt();
		System.out.printf("prime factors of no '%d' are :%s %n", no, primeFactors(no));		
	}

	private static List<Integer> primeFactors(int no) 
	{
		List<Integer> set  = new ArrayList();
		long copyOfNo = no;
		
		for(int i=2;i <=copyOfNo;i++)
		{
			if(copyOfNo%i == 0)
			{
				set.add(i);
				copyOfNo /= i;
				i--;
			}
		}
		return set;
	}

	

}
