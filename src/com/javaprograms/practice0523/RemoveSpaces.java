/**
 * 
 */
package com.javaprograms.practice0523;

import java.util.StringTokenizer;

/**Remove spaces from a string
 * @author Su6z4o7
 *
 */
public class RemoveSpaces {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "Try    to    remove   extra   spaces.";
		StringTokenizer st = new StringTokenizer(input, " ");
		StringBuffer sb = new StringBuffer();
		while(st.hasMoreElements()){
			sb.append(st.nextElement()).append(" ");
		}
		System.out.println(sb.toString().trim());
	}

}
