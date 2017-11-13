/**
 * check whether given number is binary or not
 */
package com.javaprograms.practice0327;

/**
 * @author Su6z4o7
 *
 */
public class CheckBinary 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int no = 100120;
		int temp = 0;
		boolean result = true;
		while(no != 0)
		{
			temp = no%10;
			
			if(temp > 1)
			{
				result = false;
				break;
			}
			else
			{
				no = no/10;
			}
		}
		if(result == true)
		{
			System.out.println("its a binary no");
		}
		else
		{
			System.out.println("not a binary no");
		}
		
		
		

	}

}
