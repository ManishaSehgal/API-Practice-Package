package APIProject.FirstAPIProject;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class ThirdGetRequest {

	public static void main(String[] args) {
		
		//String baseURI = "http://localhost:3000";
		//String baseString = "/friends";
		
		Response res = given().contentType(ContentType.JSON).log().all()
				       .when()
				       .get("http://localhost:3000/friends/1");
		
		System.out.println("Status code is: "+res.getStatusCode());
		System.out.println("************Response is********************");
		System.out.println(res.asString());
	
		
	}
}
