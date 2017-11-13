/**
 * 
 */
package com.selenium.concepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author Su6z4o7
 *
 */
public class QAClickAcademySelenium {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\su6z4o7\\Documents\\Downloads\\Drivers\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\su6z4o7\\Documents\\Downloads\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com");
		System.out.println(driver.getTitle());
		//Thread.sleep(5000);
		
		System.out.println(driver.getPageSource());
		driver.quit();
	}

}
