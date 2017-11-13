/**
 * 
 */
package com.javaprograms.practice0608;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

/**Identify the first non repeated character in a string
 * @author Su6z4o7
 *
 */
public class FirstNonRepeatedCharacter {

	/**Input string ="hello", result should be 'h'
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println("first non repeated character is "+firstNonRepeated(str));
	}

	private static char firstNonRepeated(String str) {
		
		char[] chArray = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(int i=0;i<chArray.length;i++){
			if(hm.containsKey(chArray[i])){
				hm.put(chArray[i], hm.get(chArray[i])+1);
			}
			else{
				hm.put(chArray[i], 1);
			}
		}
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		//printing the keys in hashmap and printing keys/value pairs 
		Set<Character> keys = hm.keySet();
		System.out.println("Printing the key value pairs in sequence");
		Iterator<Character> itr = keys.iterator();
		while(itr.hasNext()){
			char ch= itr.next();
			System.out.println("key is "+ch+" value is "+hm.get(ch));
			if(ch=='l'){
				System.out.println("no of occurences of "+ch+" is "+hm.get(ch));
			}
		}
		
		//get the first occurrence of key with value 1
		//iterate over the string again and find the first element that has value of 1
		for(int i=0;i<str.length();i++)
		{
			char c= str.charAt(i);
			if(hm.get(c)==1)
			{
				return c;
			}
		}
		throw new RuntimeException("Undefined behaviour");
	}
}
