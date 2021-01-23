package org.testing.TestScripts;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class TC10_Parameters {

	public static void main(String[] args) {
		
		Response res =given().contentType(ContentType.JSON)
		.pathParameter("city", "Mumbai")
		.queryParameter("q", "101")
		.when()
		.get("http://localhost:3000/employeesInfo/{city}");
	}

}
