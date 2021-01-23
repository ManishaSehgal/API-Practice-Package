package org.testing.TestScripts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.jayway.restassured.response.Header;
import com.jayway.restassured.response.Headers;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class TC9_Headers {
	
	public static void main(String[] args) {
		
		HashMap<String, String> headersMap = new HashMap<String, String>();
		headersMap.put("Transfer-Encoding", "chunked");
		headersMap.putIfAbsent("Content-Type", "application/json");
		
		Response res =given().headers(headersMap)
		.when()
		.get("");
		
		
		Headers headers =res.getHeaders();
		for(Header header:headers) {
			System.out.println(header.toString());
		}
		
		Iterator<Header> allHeaders = headers.iterator();
		while(allHeaders.hasNext()) {
			System.out.println(allHeaders.next());
		}
	}

}
