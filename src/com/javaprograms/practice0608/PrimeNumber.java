/**
 * 
 */
package com.javaprograms.practice0608;

import java.util.Scanner;

/**Derive two methods first to find prime no from 1 to the no and second to check if no is prime or not
 * @author Su6z4o7
 *
 */
public class PrimeNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter no to be checked");
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		System.out.println("enter the series of prime numbers from 1 to N");
		Scanner scan1 = new Scanner(System.in);
		int noSeries = scan1.nextInt();
		
		for(int i=1;i<=noSeries;i++){
			if(checkPrimeNo(i))
				System.out.print(i+" ");;
		}
		System.out.println();
		
		if(checkPrimeNo(no)){
			System.out.println(no+ " is a prime no");
		}
		else{
			System.out.println(no+" is not a prime no");
		}

	}

	private static boolean checkPrimeNo(int no) {
		int count = 0;
		for(int i=1;i<=no;i++){
			if(no%i == 0){
				count++;
			}
		}
		if(count==2){
			return true;
		}
		else{
			return false;
		}
	}

}
