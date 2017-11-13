/**
 * Program to find if two words are palindrome or not
 */
package samplePrograms;

/**
 * @author Su6z4o7
 *
 */
public class PalindromeWord 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String str1 = "india";
		String str2 = "aidniy";
		StringBuffer sb = new StringBuffer(str1);
		String strReverse = sb.reverse().toString();
		
		if(strReverse.equals(str2))
		{
			System.out.println("both the words are palindrome");
		}
		else
		{
			System.out.println("words are not palindrome");
		}
		

	}

}
