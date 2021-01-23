package org.testing.TestScripts;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.response.Response;

public class TC11_Authentication {
	
	public static void main(String[] args) {
		
	Response res=	given().auth().preemptive().basic("username", "password")
		.when().get(" ");
	
	  
	//given().auth().
		
	}

}
