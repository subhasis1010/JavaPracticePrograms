package com.selenium.concepts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;


public class Concepts {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		((JavascriptExecutor)driver).executeScript("scroll(0,400)");
		
	}
	
	@Test
	public void testSoft()
	{
		SoftAssert assertion = new SoftAssert();
		System.out.println("assertion check start");
		assertion.assertEquals(12, 13);
		System.out.println("assertion check end");
		assertion.assertAll(); //This is important to validate the soft assertion
	}
	
	@Test
	public void testHard()
	{
		System.out.println("assertion started");
		Assert.assertEquals(12, 13);
		System.out.println("assertion end");
	}
	

}
