/**
 * 
 */
package com.javaprograms.practice0523;

/**Find first two max values in an array
 * @author Su6z4o7
 *
 */
public class FirstTwoMax {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int list[] = { 15, 24, 48, 21, 43, 100, 79, 93 };
		int first = 0;
		int second = 0;
		for(int i=1;i<list.length;i++)
		{
			if(list[i]>first)
			{
				second = first;
				first=list[i];
				
			}
			else{
				second = list[i];
			}
		}
		System.out.println(first+"----"+second);
	}

}
