/**
 * 
 */
package com.javaprograms.practice0608;

import java.util.Arrays;
import java.util.Scanner;

/**Check whether two strings are anagram
 * @author Su6z4o7
 *
 */
public class AnagramProgram {

	/**"Mother In Law" and "Hitler Woman" are
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Input two Strings -> ");
		Scanner scan1 = new Scanner(System.in);
		String str1 = scan1.next();
		String str2 = scan1.next();
		
		checkAnagram(str1, str2);
		}

	private static void checkAnagram(String str1, String str2) {
		//remove spaces from both strings
		if(str1.length()!=str2.length()){
			System.out.println("not anagram");
		}
		else{
			String str1Dup = "";
			String str2Dup = "";
			str1Dup = str1.replaceAll("\\s", "").toLowerCase();
			str2Dup = str2.replaceAll("\\s", "").toLowerCase();
			char[] ch1 = str1Dup.toCharArray();
			char[] ch2 = str2Dup.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			if(Arrays.equals(ch1, ch2)){
				System.out.println("its anagram");
			}
			else{
				System.out.println("not anagram");
			}
		}
		
		
	}
}
