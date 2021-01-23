package org.testing.ResponseValidation;

import com.jayway.restassured.response.Response;

public class StatusCodeValidation {
	
	public static void validateStatusCode(Response res, int expectedCode, int actualCode) {
		if(expectedCode==actualCode) {
			System.out.println("Status code is successfully validated");
		}
		else {
			System.out.println("Wrong status code");
		}
		
		
	}

}
