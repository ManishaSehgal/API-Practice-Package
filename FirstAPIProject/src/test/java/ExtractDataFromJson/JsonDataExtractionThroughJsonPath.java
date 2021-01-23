package ExtractDataFromJson;

import static com.jayway.restassured.RestAssured.given;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class JsonDataExtractionThroughJsonPath {

	public static void main(String[] args) {
		String firstName= given().contentType(ContentType.JSON)
				.when().get("http://localhost:3000/employeesInfo")
				.then().extract().jsonPath().get("[3].firstName");
		
		
		/** 
		 * second method is
		 * -- to get the response first
		 * -- and through jsonPath(), get the value
		 * 
		 */
		
		/**
		 * Response res = given().contentType(ContentType.JSON)
				.when().get("http://localhost:3000/employeesInfo");
				
				
		 *  String firstName = res.jsonPath().get("jsonPath of the String");
		 */
        
		System.out.println(firstName);

	}

}
