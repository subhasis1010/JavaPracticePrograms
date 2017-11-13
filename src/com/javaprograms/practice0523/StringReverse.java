package com.javaprograms.practice0523;

public class StringReverse {

	public static void main(String[] args) {
		String str = "thiselement";
		
		reverserWithBuffer(str);
		reverseWithoutBuffer(str);

	}

	private static void reverseWithoutBuffer(String str) {
		char[] ch = str.toCharArray();
		String rev="";
		for(int i=ch.length-1;i>=0;i--){
			rev = rev+ch[i];
		}
		System.out.println(rev);
		
	}

	private static void reverserWithBuffer(String str) {
		char[] ch = str.toCharArray();
		StringBuffer sb = new StringBuffer();
		for(int i=ch.length-1;i>=0;i--){
			sb.append(ch[i]);
		}
		System.out.println(sb.toString());
	}

}
