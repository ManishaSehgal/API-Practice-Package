package SchemaValidation;

import static com.jayway.restassured.RestAssured.*;
import java.io.FileNotFoundException;
import com.jayway.restassured.http.ContentType;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.*;

public class ValidateSchema {
	
	public static void main(String[] args) throws FileNotFoundException {
		
	
        System.out.println("Validating schema");
		
	 	given().contentType(ContentType.JSON)
	   .when().get("http://localhost:3000/employeesInfo") 
	   .then().body(matchesJsonSchemaInClasspath("SchemaValidationFile.json"));/// Resource folder in your project
	 	//src > test > resources
		
		System.out.println("Schema has been successfully validated");		
	}

}
