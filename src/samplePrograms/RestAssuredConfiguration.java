package samplePrograms;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RestAssuredConfiguration 
{
	public void configure()
	{
		RestAssured.baseURI = "http://api.wunderground.com";
		RestAssured.basePath = "/api/5c25f5ea989a5950/conditions/q/CA/San_Francisco.json";

	}
	
	public RequestSpecification getRequestSpecification()
	{
		return RestAssured.given().contentType(ContentType.JSON);
	}
}
