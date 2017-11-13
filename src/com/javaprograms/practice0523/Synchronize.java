/**
 * 
 */
package com.javaprograms.practice0523;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**Synchronize ArrayList, HashSet and HashMap
 * @author su6z4o7
 * 
 * 1. converting hashmap key into array list use the keySet() method
 * HashMap<String, String> hm = new HashMap<>();
 * Set<String> keyset = hm.keySet();
 * 
 * 2. converting hashmap value into array list use the values() method
 * HashMap<String, String> hm = new HashMap<>();
 * Collections<String> values = hm.values();
 * 
 * 3. Convert hashmap key/value pair into arraylist
 * HashMap<String, String> hm = new HashMap<>();
 * Set<Entry<String,String>> entrySet = hm.entrySet();
 * --create arraylist of entry objects
 * ArrayList<Entry<String,String>> listOfEntry = new ArrayList<Entry<String,String>>(entrySet);
 */
public class Synchronize {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList();
		//add the elements to the arraylist
		al.add("here");
		al.add("we");
		al.add("go");
		al.add("to");
		
		System.out.println("before synchronization");
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("after synchronization");
		List<String> synchronizedList = Collections.synchronizedList(al);
		
		//this is the synchronized block under which we have to run the synchronized iterator
		synchronized(synchronizedList)
		{
			Iterator itr1 = synchronizedList.iterator();
			while(itr1.hasNext())
			{
				System.out.println(itr1.next());
			}		
		}
		
		syncHashSet();
	}

	private static void syncHashSet() {
		HashSet<String> hs = new HashSet<String>();
		hs.add("union");
		hs.add("city");
		hs.add("fremont");
		hs.add("hayward");
		
		System.out.println("printing hashset without synchronization");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("\nprinting hashset with synchronization");
		Set<String> synchronizedSet = Collections.synchronizedSet(hs);
		synchronized(synchronizedSet)
		{
			Iterator itr1 = synchronizedSet.iterator();
			while(itr1.hasNext())
			{
				System.out.println(itr1.next());
			}
		}
	}
}
