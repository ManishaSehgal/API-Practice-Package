package Headers;

import static com.jayway.restassured.RestAssured.given;

import java.util.Iterator;
import java.util.List;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Header;
import com.jayway.restassured.response.Headers;
import com.jayway.restassured.response.Response;

public class Headers_Practice {
	
	public static void main(String[] args) {
		
		Response res =given().contentType(ContentType.JSON)
				.when()
				.get("http://localhost:3000/Location");
		
		//Print all response headers
		System.out.println(res.getHeaders());
		System.out.println("***********************************");
	    System.out.println( res.asString());
		System.out.println("***********************************");
	    
	    String headerValue = res.getHeader("Pragma");
	    System.out.println(headerValue);
	    
	    Headers headers = res.getHeaders();
	    // Accessing values from Headerssssssssssssss
	    String headerVal = headers.get("Access-Control-Allow-Credentials").toString();
	    System.out.println(headerVal);
	   
	    ///Through Iterator
	    Iterator<Header> allHeaders=headers.iterator();
	    while(allHeaders.hasNext()) {
	    	System.out.println(allHeaders.next());
	    }
	    
	    System.out.println("**************Through for each loop*******************");
	    List<Header> allHeaders2= headers.asList();
	    for(Header h: allHeaders2) {
	    	System.out.println(h.getName()+"="+ h.getValue() );
	    }
	    
	}

}
