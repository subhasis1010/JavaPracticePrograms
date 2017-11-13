/**
 * 
 */
package samplePrograms;

import java.util.HashSet;

/**
 * @author Su6z4o7
 * 
 * How to find the common elements between two arrays
 *
 */
public class CommonElements {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String[] str1 = {"one", "two", "four","five", "three"};
		String[] str2 = {"twelve", "two", "thirteen","six", "four"};
		HashSet<String> hs = new HashSet();
		
		for(int i=0;i<str1.length;i++)
		{
			for(int j=0;j<str2.length;j++)
			{
				if(str1[i].equals(str2[j]))
				{
					hs.add(str1[i]);
				}
			}
		}
		System.out.println(hs);
	}

}
