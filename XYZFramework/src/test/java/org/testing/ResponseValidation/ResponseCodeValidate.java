package org.testing.ResponseValidation;

import org.testng.Assert;

import com.jayway.restassured.response.Response;

public class ResponseCodeValidate {
	
	public static void validateResponseCode(int expectedStatusCode, Response res) {
	
		Assert.assertEquals(res.statusCode(), expectedStatusCode, "Status code is not matching");
		System.out.println(res.statusLine());
	}
	
}

