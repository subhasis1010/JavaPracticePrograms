/**
 * 
 */
package com.javaprograms.practice0608;

import java.util.Scanner;

/**Program to find the fibonacci series 1, 1, 2, 3, 5, 8,...
 * @author su6z4o7
 *
 */
public class FibonacciSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Input the length of fibonacci series");
		Scanner scan= new Scanner(System.in);
		int no = scan.nextInt();
		findFibonacci(no);
	}

	private static void findFibonacci(int no) {
		int first = 0;
		int second = 1;
		int temp = 0;
		for(int i=1;i<no;i++){
			temp = first+second;
			System.out.print(temp+" ");
			second = first;
			first=temp;
			
		}
		
	}

}
