/**
 * 
 */
package com.javaprograms.practice0608;

import java.util.Scanner;

/**Identify no of times a character occurs in s string
 * @author su6z4o7
 *
 */
public class CharacterOccurenceString {

	/**
	 * @param args
	 */
	static char toCheck = 'c';
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		char toCheck = 'c';
		System.out.println(countOccur(str));

	}

	private static int countOccur(String str) {
		int count = 0;
		char[] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++){
			if(ch[i] == toCheck){
				count++;
			}
		}
		
		return count;
		
	}

}
