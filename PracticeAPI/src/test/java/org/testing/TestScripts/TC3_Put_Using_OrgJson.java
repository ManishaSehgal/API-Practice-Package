package org.testing.TestScripts;

import static com.jayway.restassured.RestAssured.*;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class TC3_Put_Using_OrgJson {

	public static void main(String[] args) {
	  
		JSONObject bodyData = new JSONObject();
		bodyData.put("id", "2673236");
		bodyData.put("firstName", "RohitKumarSrivastav");
		bodyData.put("lastName", "Sharama");
		
		
		Response res=  given().contentType(ContentType.JSON).body(bodyData.toString())
		.when()
		.put("http://localhost:3000/employeesInfo/2673236");
		
		
		System.out.println(res.asString());
		
		//6446048
	}

}
