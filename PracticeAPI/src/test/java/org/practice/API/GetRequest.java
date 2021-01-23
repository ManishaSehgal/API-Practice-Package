package org.practice.API;

import static com.jayway.restassured.RestAssured.*;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class GetRequest {
	
	String path;
	
		@BeforeMethod
		public void setUp() {
		RestAssured.baseURI="http://localhost:3000";
		path = "/CollegeInfo";
		}
		
		@Test
		public void getInfo() {
		 Response res =given().contentType(ContentType.JSON)
		.when()
		.get(path);
		
		System.out.println(res.getStatusLine());
		//System.out.println(res.asString());
		
		res.prettyPrint();
		
		}
		
	
		
		
		
	}


