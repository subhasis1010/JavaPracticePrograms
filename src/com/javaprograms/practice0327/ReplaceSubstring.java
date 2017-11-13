/**
 * 
 */
package com.javaprograms.practice0327;

/**
 * @author su6z4o7
 * Replace substring with another string
 *
 */
public class ReplaceSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String str = "This is selenium training";
		String toBeReplaced = "selenium";
		String replacedWith = "java";
		StringBuffer sb = new StringBuffer();
		//This step would create the splits and store in an string array
		String[] splits = str.split(toBeReplaced);
		for(int i=0;i<=splits.length-1;i++)
		{
			sb = sb.append(splits[i]);
			//This step would replace the string which needs to be replaced because
			//in this example str.length = 3 but after you split it would be 2
			// so we are replacing the third element with this text
			if(i!=splits.length-1)
			{
				sb = sb.append(replacedWith);
			}
		}
		System.out.println(sb);

	}

}
