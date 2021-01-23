package APIProject.FirstAPIProject;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class DeleteRequest {
	
	public static void main(String[] args) {
		
		Response res=given().contentType(ContentType.JSON)
		.when()
		.delete("http://localhost:3000/employeesInfo/3245");
		

		System.out.println("*************************StatusLine******************************");
		System.out.println(res.getStatusLine());
		System.out.println("Status Code is: "+res.statusCode());
		
		System.out.println("*************************Header**********************************");
		System.out.println(res.headers());// To get header information
		
	}
	}

