package org.testing.TestScripts;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class TC1_Get_Request {

	
	public static void main(String[] args) {
	Response res=	given().contentType(ContentType.JSON)
		.get("http://localhost:3000/employeesInfo");
	
	res.statusCode();
	System.out.println(res.getStatusLine());
	
	System.out.println("*******************");
	System.out.println(res.getHeaders());
	
	System.out.println("Response Time taken by request is: "+res.getTime()+"ms");
	String data =res.asString();
	System.out.println(data);
	
	
	}

}
