package samplePrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class ProxySetting 
{
	WebDriver driver;
	@Test
	public void setProxy()
	{
		String PROXY = "localhost:8080";
		Proxy proxy = new Proxy();
		proxy.setHttpProxy(PROXY).setFtpProxy(PROXY).setSslProxy(PROXY).setSocksProxy(PROXY);
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, proxy);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Su6z4o7\\Desktop\\Automation\\downloads\\chromedriver.exe");
		driver = new ChromeDriver(cap);
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		
		//Fluent Wait
		Wait wait = new FluentWait(driver).withTimeout(3, TimeUnit.SECONDS).pollingEvery(200, TimeUnit.MILLISECONDS).ignoring(NoSuchElementException.class);
		System.out.println("check testng");
		
		//Explicit Wait
		WebDriverWait waitE = new WebDriverWait(driver, 10);
		WebElement element = waitE.until(ExpectedConditions.elementToBeClickable(By.id("")));
		
		//driver.quit();
	}
	
}
