package com.javaprograms.top30;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NoOfDays {

	static SimpleDateFormat sdf;
	public static void main(String[] args) throws ParseException
	{
		sdf = new SimpleDateFormat("dd/MM/YYYY");
		
		String str1 = "30/07/2017";
		String str2 = "19/01/2018";
		Date date1 = getDate(str1);
		Date date2 = getDate(str2);
		
		long noOfDays = daysBetween(date1, date2);
		System.out.printf("Number of days between date %s and %s is : %d %n", date1, date2, noOfDays);
	}

	private static long daysBetween(Date date1, Date date2) 
	{
		long difference = (date1.getTime() - date2.getTime())/86400000;
		return Math.abs(difference);
	}

	private static Date getDate(String str) throws ParseException 
	{
		return sdf.parse(str);
	}

	
}
