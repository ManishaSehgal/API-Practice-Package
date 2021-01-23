package org.testing.TestScripts;

import static com.jayway.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Set;

import org.json.JSONObject;

import com.google.gson.JsonObject;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;


public class TC12_ExtractSetOfData {
	
	public static void main(String[] args) {
		
		Response res =given().contentType(ContentType.JSON)
		.when()
		.get("http://localhost:3000/employeesInfo/88627763");
		

		JSONObject jsObj = new JSONObject(res.asString());
	    Set<String> allkeys = jsObj.keySet();
	   try {
	    for(String k:allkeys) {
	         String keyValue = jsObj.getString(k);
	         System.out.println(k+" : "+keyValue);
	    }
	   }
	   catch (Exception e) {
		// TODO: handle exception
	}
		
		
	}

}
