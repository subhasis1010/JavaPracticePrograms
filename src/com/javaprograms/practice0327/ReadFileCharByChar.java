/**
 * 
 */
package com.javaprograms.practice0327;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author su6z4o7
 * Program to read characters in a document line by line
 *
 */
public class ReadFileCharByChar 
{

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException 
	{
		FileReader fr  = new FileReader("C:\\Users\\su6z4o7\\Desktop\\LineByLine.txt");
		BufferedReader br = new BufferedReader(fr);
		StringBuffer sb = new StringBuffer();
		while(br.readLine()!=null)
		{
			sb.append(br.readLine());
		}
		System.out.println(sb);
	}
}



