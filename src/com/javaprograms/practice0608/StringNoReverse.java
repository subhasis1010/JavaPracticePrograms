/**
 * Reverse a string or number
 * String reverse and number reverse programs are clubbed together
 */
package com.javaprograms.practice0608;

import java.util.Scanner;

/**
 * @author Su6z4o7
 * 
 *
 */
public class StringNoReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str="this";
		char[] ch = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=ch.length-1;i>=0;i--){
			sb.append(ch[i]);
		}
		System.out.println(sb.toString());
		
		Scanner scan =  new Scanner(System.in);
		int no = scan.nextInt();
		System.out.println(noReverse(no));
	}

	private static int noReverse(int no) {
		int reverse = 0;
		while(no>0){
			reverse = reverse*10 + no%10;
			no= no/10;
		}
		return reverse;
		
	}

}
