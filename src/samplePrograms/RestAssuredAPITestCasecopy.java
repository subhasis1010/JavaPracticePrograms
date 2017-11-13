/**
 * 
 */
package samplePrograms;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.codingchallenge.framework.RestAssuredConfiguration;

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
public class RestAssuredAPITestCasecopy 
{
	Response response;
	ConfigDataProvider config = new ConfigDataProvider();
	@BeforeTest
	public void getResponse()
	{
		given().get(config.getEndPointURL()).then().statusCode(200).log().all();
		response = given().get(config.getEndPointURL());
	}
	
	
	@Test
	public void demoTest1()
	{
		//given().get(EndPoint.URL).then().statusCode(200).log().all();
		//Response response = given().get(EndPoint.URL);
		Assert.assertEquals(config.versionNo(), response.path("response.version"));
		System.out.println(response.path("response.version"));
		
		float fahrenheit = response.path("current_observation.temp_f");
		HelperUtilityAPI utility = new HelperUtilityAPI();
		float celsius = utility.temperatureConversion(fahrenheit);
		
		Assert.assertEquals(celsius, response.path("current_observation.temp_c"));
		System.out.println(celsius+"   "+fahrenheit+"   "+response.path("current_observation.temp_c"));
		
		
		String observationTime = response.path("current_observation.observation_time");
		Assert.assertEquals(true, utility.dateValidator(observationTime));
	}
	

}
