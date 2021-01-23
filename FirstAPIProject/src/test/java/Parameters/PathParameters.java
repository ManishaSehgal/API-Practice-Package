package Parameters;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class PathParameters {
	public static void main(String[] args) {
		
	Response res= given().contentType(ContentType.JSON)
	.pathParameter("id", "101").
	when().get("http://localhost:3000/employeesInfo/{id}");
	
	System.out.println(res.asString());
	
	
		
	}

}
