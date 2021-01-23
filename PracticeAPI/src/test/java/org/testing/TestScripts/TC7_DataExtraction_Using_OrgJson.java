package org.testing.TestScripts;

import static com.jayway.restassured.RestAssured.*;

import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class TC7_DataExtraction_Using_OrgJson {
	
	public static void main(String[] args) {
		
		Response res =given().contentType(ContentType.JSON)
		.get();
		
		//get id of second object in json 	
		JSONArray arr = new JSONArray(res.asString());
		String id = arr.getJSONObject(1).getString("id");
		
		//get all ids
		int length = arr.length();
		for(int i=0; i<length; i++) {
			String idValue = arr.getJSONObject(i).getString("id");
			System.out.println(idValue);
		}
		
		//on the basis of specific data
		for(int i=0; i<arr.length(); i++) {
			try {
				String firstName = arr.getJSONObject(i).getString("firstName");
				String lastName = arr.getJSONObject(i).getString("lastName");
				if(firstName.equals("Rajesh")&& (lastName.equals("Kumar"))) {
					String idValue = arr.getJSONObject(i).getString("id");
					System.out.println(idValue);
				}
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		

}
}
