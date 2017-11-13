/**
 * 
 */
package samplePrograms;

import java.util.Scanner;

/**Check if the number is prime no or not
 * @author Su6z4o7
 *
 */
public class PrimeNo {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("enter the no to check");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		for(int j=1;j<=number;j++)
		{
			if(checkPrimeNo(j)==true)
			{
				System.out.println(j+" is a prime no");
			}
			else{
				System.out.println(j+ " is not a prime no");
			}
		}
	}
	
	public static boolean checkPrimeNo(int no)
	{
		int count = 0;
		for(int i=1;i<=no;i++)
		{
			if(no%i == 0)
			{
				count++;
			}
		}
		if(count == 2)
		{
			return true;
		}
		else{
			return false;
		}
		
	}
	
	
	

}
