package org.testing.TestScript;

import org.testing.Utilities.Conversion;

import static com.jayway.restassured.RestAssured.*;

import java.io.FileNotFoundException;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class TC_8 {
	public static void main(String[] args) throws FileNotFoundException {
		
		String bodyData =Conversion.XmlToJsonConverter();
		
		
		/*
		 * Response res = given().contentType(ContentType.JSON)
		 * .body(bodyData).post("http://localhost:3000/employeesInfo");
		 */		
		//System.out.println(res.statusLine());
		
	 Conversion.jsonToXMLConversion(bodyData);
	}

}
