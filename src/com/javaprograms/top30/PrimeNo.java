/**
 * 
 */
package com.javaprograms.top30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Su6z4o7
 * Prime no program
 */
public class PrimeNo {

	/**
	 * @param args
	 */
	
	//static int number = 16;
	public static void main(String[] args) 
	{
		System.out.println("Input the number which needs to be determined");
		Scanner scan= new Scanner(System.in);
		int no = scan.nextInt();
		primeNo(no);
		listPrimeNo(10);

	}
// this program prints the list of prime numbers
	private static void listPrimeNo(int no)
	{
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i=1;i<=no;i++)
		{
			int count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j == 0)
				{
					count++;
				}
			}
			if(count==2)
			{
				list.add(i);
			}
		}
		System.out.println(list);
	}
	
	// this only checks one number
	private static void primeNo(int no) 
	{
		int count=0;
		for(int i=1;i<=no;i++)
		{
			if(no%i == 0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("prime no");
		}
	}

}
