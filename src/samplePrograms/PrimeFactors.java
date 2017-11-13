/**
 * Determine the prime factors of a number
 */
package samplePrograms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author Su6z4o7
 *
 */
public class PrimeFactors 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Enter the number whose prime factor needs to be determined");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=2;i<=number;i++)
		{
			if(number%i == 0)
			{
				al.add(i);
			}
		}
		Iterator<Integer> itr = al.iterator();
		System.out.println("the prime factors are listed below");
		while(itr.hasNext())
		{
			System.out.print(itr.next()+"--");
		}
	}

}
