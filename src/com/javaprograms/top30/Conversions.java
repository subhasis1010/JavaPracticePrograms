/**
 * convert int to string and vice versa
 */
package com.javaprograms.top30;

import java.util.StringTokenizer;

import javax.swing.JPasswordField;

/**Program is running on infinite loop
 * @author Su6z4o7
 *
 */
public class Conversions {

	/**
	 * @param args
	 */
	
	protected void finalize()
	{
		System.out.println("testing garbage collection");
	} 
	
	public static void main(String[] args) 
	{
		String s = "000123";
		//int i = Integer.parseInt(s);
		int i = Integer.valueOf(s);
		System.out.println(i);
		
		String s1 = i+"";
		System.out.println(s1+"append");
		String s2 = String.format("%d", i);
		System.out.println("s2: "+s2);
		
		JPasswordField jpass = new JPasswordField();
		jpass.setName("india");
		System.out.println(jpass.getPassword());
		
		Conversions c1 = new Conversions();
		Conversions c2 = new Conversions();
		c2 = null;
		c1=c2;
		System.gc();
		
		// String Tokenizer
		
		StringTokenizer st = new StringTokenizer("This is a good place");
		while(st.hasMoreElements())
		{
			System.out.println(st.hasMoreTokens());
		}
		

	}

}
