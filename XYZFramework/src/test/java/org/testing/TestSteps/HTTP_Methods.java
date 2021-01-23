package org.testing.TestSteps;

import static com.jayway.restassured.RestAssured.*;

import java.util.Properties;

import com.jayway.restassured.http.ContentType;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.*;
import com.jayway.restassured.response.Header;
import com.jayway.restassured.response.Response;

public class HTTP_Methods {

	Properties p;

	public  HTTP_Methods(Properties p) {
		this.p= p;
	}

	public Response postRequest(String bodyData, String uriName) {
		
		Response res=	given().contentType(ContentType.JSON).body(bodyData)
				.when()
				.post(p.getProperty(uriName));
		return res;

	}
	
	public Response getRequest(String idValueForGet, String uriKey) {
		
		String getURI = p.getProperty(uriKey)+"/"+idValueForGet;
		Response res =given().contentType(ContentType.JSON)
		.when().get(getURI);
		return res;
	}
	
	public Response getRequest_AllData(String uriKey) {
		String getURI = p.getProperty(uriKey);
	    Response res= given().contentType(ContentType.JSON)
				       .when()
				       .get(getURI);
				     
		return res;
	}
	
	public Response putRequest(String bodyDataForPut, String idValueForPut, String uriKey) {
		
		String putURI = p.getProperty(uriKey)+"/"+ idValueForPut;
		Response res = given().contentType(ContentType.JSON)
				       .body(bodyDataForPut)
				       .when().put(putURI);
		
		return res;
	}
	
	public Response deleteRequest(String uriKey, String id) {
		String deleteURI = p.getProperty(uriKey)+"/"+id;
		Response res = given().contentType(ContentType.JSON)
			           .when()
			           .delete(deleteURI);
		return res;	
	}
	
	public Response getRequestWithQueryParameters(String uriKey, String searchKey, String searchValue) {
		String getURI = p.getProperty(uriKey);
		
		Response res =given().contentType(ContentType.JSON)
		.queryParameter(searchKey, searchValue)
		.when()
		.get(getURI);
		return res;
		
	}
	
	public Response patchRequest(String uriKey, String idValue, String data) {
		
		String patchURI = p.getProperty(uriKey)+"/"+idValue;
		
		Response res =given().contentType(ContentType.JSON).body(data)
		.when()
		.patch(patchURI);
		
		return res;
		
	}

}
