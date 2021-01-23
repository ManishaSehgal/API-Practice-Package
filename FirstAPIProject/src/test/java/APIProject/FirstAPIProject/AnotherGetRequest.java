package APIProject.FirstAPIProject;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.http.Method;
import com.jayway.restassured.response.Response;
import com.jayway.restassured.response.ValidatableResponse;
import com.jayway.restassured.specification.RequestSpecification;

public class AnotherGetRequest {

	public static void main(String[] args) throws Exception{
	
		
			
			
		
		//Retreiving data with the help of id
			
		
		RequestSpecification r =given().contentType(ContentType.JSON).when();
		Response res2=r.get("http://localhost:3000/friends/1");	
		res2.prettyPrint();
		
	    
			
			
		
			
	}

}
