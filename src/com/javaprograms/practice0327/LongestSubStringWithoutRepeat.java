/**
 * 
 */
package com.javaprograms.practice0327;

import java.util.LinkedHashMap;

/**
 * @author Su6z4o7 longest substring without repeating or duplicate characters
 *         in a given string
 *
 */
public class LongestSubStringWithoutRepeat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "lifeeaster";
		char[] ch = str.toCharArray();
		String longestSubstring = null;
		int longestSubStringLength = 0;

		// Created a linked hashmap
		LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < ch.length; i++) {
			if (!charPosMap.containsKey(ch[i])) {
				charPosMap.put(ch[i], i);
			} else {
				i = charPosMap.get(ch[i]);
				charPosMap.clear();
			}
			if(charPosMap.size()>longestSubStringLength)
			{
				longestSubStringLength = charPosMap.size();
				longestSubstring = charPosMap.keySet().toString();
			}
		}
		System.out.println(longestSubstring);
	}
}
