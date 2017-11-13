package com.javaprograms.practice0608;

import java.util.Arrays;

public class Rough {
	
	public static void main(String[] args){
		String str = "helloworld";
		str.substring(2);
		System.out.println(str);
		
		String str1 = "this is good";
		String str2 = str1.replaceAll("\\s", "");
		char[] ch1 = str2.toCharArray();
		Arrays.sort(ch1);
		System.out.println(ch1);
		
		//String to integer conversion
		String str3 = "123a";
		int i=0;
		try{
			i = Integer.parseInt(str3);
		}
		catch(NumberFormatException n){
			System.out.println(n.getMessage());
			System.out.println(i);
		}
		String str4 = "22";
		System.out.println(Integer.valueOf(str4));
	}
	

}
