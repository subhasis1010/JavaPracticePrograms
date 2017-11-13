/**
 * 
 */
package samplePrograms;

import java.util.ArrayList;
import java.util.Iterator;


/**Program to find if a number is palindrome or not
 * @author Su6z4o7
 *
 */
public class PalindromeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		/**** Nice try but not good enough
		int num = 313;
		ArrayList<Integer> al = new ArrayList<Integer>();
		while(num>0)
		{	
			al.add(num%10);
			num = num/10;
		}
		
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		*/
		
		int number = 313;
		int reverse = checkPalindrome(313);
		
		if(reverse == number)
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
	}
	
	// we are creating a function to declare the program logic and identify if the number is palindrome or not
	public static int checkPalindrome(int number)
	{
		int reverse = 0;
		while(number!=0)
		{
			reverse = reverse*10 + number%10;
			number = number/10;
		}
		return reverse;
	}

}
