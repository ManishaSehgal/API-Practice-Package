package org.testing.TestScripts;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.JsonArray;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class TC2_Post_Using_OrgJson {
	
	public static void main(String[] args) {
		
		JSONObject company1 = new JSONObject();
		company1.put("Name", "TCS");
		company1.put("city", "Delhi");
		
		
		JSONObject company2 = new JSONObject();
		company2.put("Name", "eValueServe");
		company2.put("city", "Gurugram");
		
		JSONArray jsArr = new JSONArray();
		jsArr.put(0, company1);
		jsArr.put(1, company2);
		
		
		JSONObject bodyData = new JSONObject();
		bodyData.put("id", "9278");
		bodyData.put("FirstName", "Neelima");
		bodyData.put("LastName", "Chopra");
		bodyData.put("Age", "34");
		bodyData.put("CompanyDetails", jsArr);
		
		
		Response res=given().contentType(ContentType.JSON).body(bodyData.toString())
		.when()
		.post("http://localhost:3000/employeesInfo");
		
		res.prettyPrint();
	}

}
