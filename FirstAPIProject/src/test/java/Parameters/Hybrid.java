package Parameters;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class Hybrid {
	public static void main(String[] args) {
		
		//In case of applying both path and query parameter, path parameter will be applied first
		
		Response res= given().contentType(ContentType.JSON)
				.pathParameter("id", "101")
				.queryParam("lastName", "Sehgal")
				.when().get("http://localhost:3000/employeesInfo/{id}");
				
				System.out.println(res.asString());
	}

}
