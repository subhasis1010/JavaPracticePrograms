/**
 * 
 */
package com.javaprograms.practice0608;

import java.util.Scanner;

/**Find the longest palindrome in a string
 * @author Su6z4o7
 *
 */
public class LongestPalindromeInString {

	/**If input is “forgeeksskeegfor”, the output should be “geeksskeeg”
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		longestPalindrom(str);
	}
	
	//method for longest palindrome
	private static void longestPalindrom(String str) {
		StringBuffer sb = new StringBuffer();
		String s = null;
		int len = str.length();
		for(int k=1;k<len/2;k++){
			s = sb.append(str.substring(k, len-(k))).toString();
			checkPalindrome(s);
		}
	}

	private static void checkPalindrome(String s) {
		char[] c = s.toCharArray();
		StringBuffer strBuffer = new StringBuffer();
		for(int i=c.length-1;i>=0;i--){
			strBuffer.append(c[i]);
		}
		if(s.equals(strBuffer.toString())){
			System.out.println("its palindrome "+s);
		}
		
	}

}

