package org.testing.ResponseValidation;

import com.jayway.restassured.response.Response;

public class DataValidation {
	
	public static void dataValidation (Response res, String expectedData, String jsonPath) {
		String actualData = res.jsonPath().get(jsonPath);
		if(expectedData.equals(actualData)) {
			System.out.println("Data is successfully validated");
		}
		else {
			System.out.println("Data is not validated");
		}
		
		
	}

}
