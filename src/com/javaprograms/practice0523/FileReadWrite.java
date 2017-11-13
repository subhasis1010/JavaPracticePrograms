/**
 * 
 */
package com.javaprograms.practice0523;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author su6z4o7
 * 
 * Append text to file in java
 * 	FileWriter fileWriter = new FileWriter(“Pass File Name Here”);     //Overwrites the text file
	FileWriter fileWriter = new FileWriter(“Pass File Name Here”, false);     //Overwrites the text file
	FileWriter fileWriter = new FileWriter(“Pass File Name Here”, true);     //Appends to the text file
	
	FileWriter class would also create a file if its not existing
 *
 */
public class FileReadWrite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// intialize all the resources
		FileWriter fileWriter = null;
		BufferedWriter bf = null;
		PrintWriter printW = null;
		
		try {
			fileWriter = new FileWriter("C:\\Users\\su6z4o7\\Desktop\\Automation\\Selenium\\File3.txt");
			bf= new BufferedWriter(fileWriter);
			printW = new PrintWriter(bf);
			printW.println("yes");
		} catch (Exception e) {
			e.getMessage();
		}
		
		System.out.println("done adding");
		
		//closing the resources
		try {
			printW.close();
			bf.close();
			fileWriter.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		readData();
	}

	private static void readData() {
		try {
			FileReader fr = new FileReader("C:\\Users\\su6z4o7\\Desktop\\Automation\\Selenium\\File3.txt");
			BufferedReader br = new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
