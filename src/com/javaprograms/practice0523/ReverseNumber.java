/**
 * 
 */
package com.javaprograms.practice0523;

/**Reverse a number in java
 * @author Su6z4o7
 *
 */
public class ReverseNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number = 321;
		int reverse=0;
		
		while(number>0)
		{
			reverse= reverse*10+number%10;
			number = number/10;
		}
		System.out.println(reverse);

	}

}
