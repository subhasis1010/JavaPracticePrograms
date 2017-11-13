/**
 * Replace substring with another string in a string
 */
package samplePrograms;

/**
 * @author Su6z4o7
 *
 */
public class SubstringReplace {

	/**
	 * @param args
	 */
	static String str = "this is a good place";
	static String toBeReplaced = "good";
	static String toBeReplacedWith = "wonderful";
	public static void main(String[] args) 
	{
		System.out.println(newString());

	}
	
	private static StringBuffer newString()
	{
		String[] strNew = str.split(toBeReplaced);
		StringBuffer sb = new StringBuffer();
		/*
		 * This is where the actual logic of the program exists
		 * check when i is not equal to length-1, it would try and append
		 */
		for(int i=0;i<=strNew.length-1;i++)
		{
			sb = sb.append(strNew[i]);
			if(i!=strNew.length-1)
			{
				sb = sb.append(toBeReplacedWith);
			}
			
		}
		return sb;
			
	}
	

}
