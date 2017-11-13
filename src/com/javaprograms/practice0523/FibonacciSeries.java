/**
 * 
 */
package com.javaprograms.practice0523;

/**Program to print fibonacci series upto 100
 * @author Su6z4o7
 *
 */
public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int temp=0;
		while(temp<100)
		{
			temp=first+second;
			System.out.println(temp);
			second=first;
			first=temp;
			
		}

	}

}
