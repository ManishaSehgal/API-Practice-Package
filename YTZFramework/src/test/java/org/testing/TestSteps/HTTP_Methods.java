package org.testing.TestSteps;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class HTTP_Methods {
	Properties p;
	
	public HTTP_Methods(Properties p) {
		this.p = p;
	}
	
	public Response postRequest(String uriKey, String bodyData) {
		String postURI = p.getProperty(uriKey);
		
		Response res =given().contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.post(postURI);
		
		return res;
		
	}
	
	public Response getRequest(String uriKey, String idValue) {
		String getURI = p.getProperty(uriKey)+"/"+ idValue ;
		
		Response res =given().contentType(ContentType.JSON)
		.when()
		.get(getURI);
		
		return res;	
	}
	
	public Response getRequestQueryParameters(String uriKey, String searchKey, String searchKeyValue) {
		String get_URI = p.getProperty(uriKey);
		
		Response res =given().contentType(ContentType.JSON)
		.queryParameter(searchKey, searchKeyValue)
		.when()
		.get(get_URI);
		
		return res;
		
	}

}
