package Parameters;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class QueryParameters {
	
	public static void main(String[] args) {
		Response res= given().contentType(ContentType.JSON)
				.queryParameter("lastName", "Sharama")
				.when().get("http://localhost:3000/employeesInfo");
				
				System.out.println(res.asString());
	}

}
