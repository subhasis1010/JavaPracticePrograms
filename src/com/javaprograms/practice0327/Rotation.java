/**
 * Check Whether One String Is Rotation Of Another?
 */
package com.javaprograms.practice0327;

/**
 * @author Su6z4o7
 *
 */
public class Rotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String str1 = "StrutsHibernateJavaJ2ee";
		String str2 = "JavaJ2eeStrutaHibernate";
		String str3 = str1+str1;
		
		if(str1.length()!=str2.length())
		{
			System.out.println("not a rotated version");
		}
		
		if(str3.contains(str2))
		{
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}

	}

}
