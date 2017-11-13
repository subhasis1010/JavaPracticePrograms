package com.javaprograms.practice0327;

import java.util.ArrayList;
import java.util.HashSet;

/*
 * Removing Duplicate Elements From ArrayList Using HashSet
 */

public class RemoveDuplicates {

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList();
		al.add("java");
		al.add("spring");
		al.add("test");
		al.add("my");
		al.add("java");
		al.add("home");
		
		System.out.println("Array list with duplicates are "+al);
		
		//List without duplicates but not in correct order and using HashSet
		HashSet<String> hs = new HashSet();
		for(String s:al)
		{
			hs.add(s);
		}
		System.out.println("list without duplicates are "+hs);
		
		//Without using hashset but in the correct order
		ArrayList<String> al1 = new ArrayList();
		for(String s:al)
		{
			if(!al1.contains(s))
			{
				al1.add(s);
			}
		}
		System.out.println("list in the same order "+al1);
	}

}
