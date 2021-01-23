package APIChaining;

import static com.jayway.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Headers;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.specification.RequestSpecification;

public class GetRequest {
	
	public static void getRequest(String uri) {
		Response res =given().contentType(ContentType.JSON)
		.when()
		.get(uri);
		
		System.out.println(res.statusLine());
		res.prettyPrint(); 
	
		
	}

}
