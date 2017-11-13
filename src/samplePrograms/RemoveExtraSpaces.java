/**
 * Write Java Code To Get Rid Of Multiple Spaces From A String?
 */
package samplePrograms;

import java.util.StringTokenizer;

/**
 * @author Su6z4o7
 *
 */
public class RemoveExtraSpaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String str = "remove     extra spaces";
		StringTokenizer substr = new StringTokenizer(str);//check what the StringTokenizer class does
		StringBuffer sb = new StringBuffer();
		while(substr.hasMoreElements())
		{
			sb.append(substr.nextElement());
		}
		System.out.println("Actual string is: "+str);
		System.out.println("Converted string is: "+sb.toString().trim());
	}

}
