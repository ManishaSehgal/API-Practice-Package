package org.testing.TestScripts;

import static com.jayway.restassured.RestAssured.given;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class TC5_Delete_Using_OrgJson {
	
	public static void main(String[] args) {
		

		
		Response res=  given().contentType(ContentType.JSON)
		.when()
		.delete("http://localhost:3000/employeesInfo/DOMMCmV");
		
		
		System.out.println(res.asString());
		
		//6446048
		// "firstName": "mvuOLTvw",
	   // "lastName": "Malhotra",
	    //"id": "1599626756"
		
	}

}
