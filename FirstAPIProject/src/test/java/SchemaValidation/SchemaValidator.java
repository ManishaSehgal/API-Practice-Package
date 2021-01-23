package SchemaValidation;

import static com.jayway.restassured.RestAssured.*;

import javax.annotation.MatchesPattern;

import com.jayway.restassured.http.ContentType;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.*;

public class SchemaValidator {

	public static void main(String[] args) {
		
      System.out.println("Validating json schema");
		
	   given().contentType(ContentType.JSON)
	   .when().get(" http://localhost:3000/employeesInfo")
	   .then().body(matchesJsonSchemaInClasspath("SchemaFile.json"));
	   
	   System.out.println("Json schema got validated successfully");
	}
}
