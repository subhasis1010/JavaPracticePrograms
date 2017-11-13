/**
 * 
 */
package samplePrograms;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.codingchallenge.framework.RestAssuredConfiguration;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import dataProvider.ConfigDataProvider;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

import utility.HelperUtilityAPI;

import static io.restassured.RestAssured.given;

/**
 * @author Su6z4o7
 *
 */
public class RestAssuredAPITestCase 
{
	Response response;
	ConfigDataProvider config;
	HelperUtilityAPI utility;
	ExtentReports report;
	ExtentTest logger;
	
	@BeforeTest
	public void getResponse()
	{
		report = new ExtentReports("./Reports/APITestResults.html", true);
		logger = report.startTest("API Validations");
		config = new ConfigDataProvider();
		//Rest Assured given/then methods to GET the end point results
		given().get(config.getEndPointURL()).then().statusCode(config.statusCode()).log().all();
		response = given().get(config.getEndPointURL());
		
		logger.log(LogStatus.INFO, "Response received with 200 OK message");
		
	}
	
	@Test (priority = 1)
	public void validateVersionNo()
	{
		Assert.assertEquals(config.versionNo(), response.path("response.version"));
		logger.log(LogStatus.PASS, "Version No received in the response is "+config.versionNo());
	}
	
	@Test (priority = 2)
	public void validateTemperatureConversion()
	{
		float fahrenheit = response.path("current_observation.temp_f");
		utility = new HelperUtilityAPI();
		float celsius = utility.temperatureConversion(fahrenheit);
		logger.log(LogStatus.INFO, "Celsius value -> "+celsius+" Fahrenheit value -> "+fahrenheit);
		Assert.assertEquals(celsius, response.path("current_observation.temp_c"));
		logger.log(LogStatus.PASS, "Celsius and Fahrenheit temperatures are converted correctly ");
	}
	
	@Test (priority = 3)
	public void validateDate()
	{
		String observationTime = response.path("current_observation.observation_time");
		utility = new HelperUtilityAPI();
		logger.log(LogStatus.INFO, "Observation Time field returns ->"+ observationTime);
		Assert.assertEquals(true, utility.dateValidator(observationTime));
		logger.log(LogStatus.PASS, "Current date is present in observation time");
	}
	
	@AfterTest
	public void endTest()
	{
		report.endTest(logger);
		report.flush();
	}

}
