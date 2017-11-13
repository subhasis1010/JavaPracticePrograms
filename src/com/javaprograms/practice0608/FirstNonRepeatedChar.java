/**
 * 
 */
package com.javaprograms.practice0608;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

/** Find the first non repeated character in a string
 * @author su6z4o7
 *
 */
public class FirstNonRepeatedChar {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the string to determine the non repeated character");
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		nonRepeat(str);
	}

	private static void nonRepeat(String str) {
		char[] ch = str.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0;i<str.length();i++){
			if(hm.containsKey(ch[i])){
				hm.put(ch[i], hm.get(ch[i])+1);
			}
			else{
				hm.put(ch[i], 1);
			}
		}
		
				
		for(int i=0;i<str.length();i++){
			if(hm.get(ch[i])==1){
				System.out.println("first non repeated character is "+ch[i]);
				break;
			}
		}
		
		// develop logic for the condition where there are no unique elements.
		int count=0;
		Iterator it = hm.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Character, Integer> map = (Entry<Character, Integer>) it.next();
			if(map.getValue() ==1){
				count++;
			}
		}
		if(count==0){
			System.out.println("there are no unique elements in the string");
		}
	}

}
