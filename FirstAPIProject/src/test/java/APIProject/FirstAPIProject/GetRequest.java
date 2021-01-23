package APIProject.FirstAPIProject;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class GetRequest {

	public static void main(String[] args) {
		
		Response res =given()
		.when()
		.get("http://localhost:3000/friends");
		
		System.out.println("*************************StatusLine******************************");
		System.out.println(res.getStatusLine());
		System.out.println("Status Code is: "+res.statusCode());
		
		System.out.println("*************************Header**********************************");
		System.out.println(res.headers());// To get header information
		
		System.out.println("*************************Body************************************");
		System.out.println(res.asString());
	}
}
