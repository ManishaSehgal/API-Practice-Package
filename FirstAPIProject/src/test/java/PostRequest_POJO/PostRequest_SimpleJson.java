package PostRequest_POJO;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class PostRequest_SimpleJson {

	public static void main(String[] args) {
		EmployeeBodyData_SimpleJson empObj = new EmployeeBodyData_SimpleJson();
		empObj.setFirstName("Paramjeet");
		empObj.setLastName("Kaur");
		empObj.setId("109");
		empObj.setDesignation("QA Team Lead");
		
		Response res =given().contentType(ContentType.JSON).body(empObj)
		.when().post("http://localhost:3000/employeesInfo");
		
		System.out.println(res.getStatusLine());
		System.out.println("*******************************");
		System.out.println(res.asString());
		
		
		
		

	}

}
