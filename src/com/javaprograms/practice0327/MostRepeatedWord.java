/**
 * 
 */
package com.javaprograms.practice0327;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author Su6z4o7
 * Find the most repeated word in a text
 *
 */
public class MostRepeatedWord {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "here comes he man who is not he star he is a super star a";
		String[] strArray = str.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(String s:strArray)
		{
			if(hm.containsKey(s))
			{
				hm.put(s, hm.get(s)+1);
			}
			else
			{
				hm.put(s, 1);
			}
		}
		
		Set entrySet = hm.entrySet();
		Iterator itr = entrySet.iterator();
		int count=0;
		String mostRepeatedWord = null;
		//Map.Entry<String, Integer> me= (Map.Entry<String, Integer>)itr.next();
		while(itr.hasNext())
		{
			Map.Entry<String, Integer> me = (Map.Entry<String, Integer>)itr.next();
			//System.out.println(me.getKey()+ "----"+me.getValue());
			if(me.getValue()>count)
			{
				mostRepeatedWord = me.getKey();
				count = me.getValue();
			}	
		}
		System.out.println("most repeated key is "+mostRepeatedWord);
	}
}
