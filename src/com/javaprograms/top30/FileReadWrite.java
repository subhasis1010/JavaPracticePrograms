/**
 * 
 */
package com.javaprograms.top30;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * @author Su6z4o7
 *
 */
public class FileReadWrite {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception
	{
		File src = new File("C:\\Users\\Su6z4o7\\Documents\\Workspace\\Test.txt");
		FileOutputStream fout = new FileOutputStream(src);
		String str = "this is a game paypadd";
		byte[] b = str.getBytes();
		fout.write(b);
		fout.write(65);
		fout.flush();
		fout.close();
		int i=0;
		FileInputStream fis = new FileInputStream(src);
		while((i = fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		fis.close();
		
		System.out.println();
		File src1 = new File("C:\\Users\\Su6z4o7\\Documents\\Workspace\\TestBuffer.txt");
		FileOutputStream fout1 = new FileOutputStream(src1);
		BufferedOutputStream bos = new BufferedOutputStream(fout1);
		String str1 = "this is a bart train";
		byte[] b1 = str1.getBytes();
		bos.write(b1);
		bos.flush();
		bos.close();
		fout1.close();
		
		FileInputStream fis1 = new FileInputStream(src1);
		BufferedInputStream bis = new BufferedInputStream(fis1);
		int j=0;
		while((j = bis.read())!=-1)
		{
			System.out.print((char)j);
		}
		bis.close();
		fis1.close();
		
	}

}
