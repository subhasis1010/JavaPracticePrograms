/**
 * Program to add two integers without using arithmetic operator
	Incomplte program..
 */
package samplePrograms;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Su6z4o7
 *
 */
public class AddTwoIntegers {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println("Enter three numbers");
		Scanner scan = new Scanner(System.in);
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(number1);
		al.add(number2);
		System.out.println(al);
		

	}

}
