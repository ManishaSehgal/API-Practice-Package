package org.testing.TestScripts;

import static com.jayway.restassured.RestAssured.given;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class TC4_Patch_Using_OrgJson {
	
	public static void main(String[] args) {
		
		JSONObject bodyData = new JSONObject();
		bodyData.put("firstName", "TulsiKumar");
		
		
		Response res=  given().contentType(ContentType.JSON).body(bodyData.toString())
		.when()
		.patch("http://localhost:3000/employeesInfo/1599626756");
		
		
		System.out.println(res.asString());
		
		//6446048
		// "firstName": "mvuOLTvw",
	   // "lastName": "Malhotra",
	    //"id": "1599626756"
		
	}

}
