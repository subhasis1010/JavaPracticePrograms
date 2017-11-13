/**
 * 
 */
package com.javaprograms.practice0523;

import java.util.Scanner;

/**Program to print Floyd's triangle
 * @author su6z4o7
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 *
 */
public class FloydsTriangle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int no = scan.nextInt();
		int count=1;
		for(int i=1;i<=no;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}

	}

}
