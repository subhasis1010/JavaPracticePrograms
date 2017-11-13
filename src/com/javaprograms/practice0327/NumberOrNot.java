/**
 * Find whether the string entered is a number
 */
package com.javaprograms.practice0327;

/**
 * @author Su6z4o7
 *
 */
public class NumberOrNot {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String s = "1235543210a";
		//System.out.println(checkNo(s));
		
		//Logic for checking if its a mobile no
		
		if(checkNo(s)== true && s.length()==10)
		{
			System.out.println("number is a mobile no "+s);
		}
		else {
			System.out.println("Nope");
		}
		
		try 
		{
			Integer.parseInt(s);
		}
		catch(Exception e)
		{
			System.out.println("Number format exception is "+e.getMessage());
		}
		
	}

	private static boolean checkNo(String s) 
	{
		try 
		{
			int i = Integer.parseInt(s);
			return true;
		}
		catch (NumberFormatException e)
		{
			System.out.println("exception is "+e.getMessage());
			return false;
		}
		
	}
	
	

}
