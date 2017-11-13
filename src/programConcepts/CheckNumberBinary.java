/**
 * 
 */
package programConcepts;

/**
 * @author Su6z4o7
 *
 */
public class CheckNumberBinary {

	/**
	 * @param args
	 */
	
	static int number = 101111;
	static boolean result;
	public static void main(String[] args) 
	{
		result = isBinary(number);
		if(result == false)
		{
			System.out.println("Not a binary no");
		}
		else
		{
			System.out.println("It is a binary no");
		}
			

	}
	public static boolean isBinary(int number) 
	{
		while(number>0)
		{
			if(number%10 <= 1)
			{
				number=number/10;	
			}
			else
			{
				result = false;
				break;
			}
			result = true;
			
		}
		return result;
		
		
	}

}
