package org.testing.ResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

public class ResponseDataValidation {
	
	public static void validateResponseData(Response res, String expectedData, String jsonPath) {
		
		String actualData = res.jsonPath().getString(jsonPath);
		Assert.assertEquals(actualData, expectedData, "Data is not matching");
		
	}

}
