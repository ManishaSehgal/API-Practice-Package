package PostRequest_POJO;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class PostRequest_POJO_ComplexJson {

	public static void main(String[] args) {
		Address addressObj = new Address();
		addressObj.setHouseNumber("1873");
		addressObj.setStreetName("Ganeshpura");
		addressObj.setCity("Sultanpur");
		addressObj.setAreaCode("96242");

		EmployeeBodyData_SimpleJson empObj = new EmployeeBodyData_SimpleJson();
		empObj.setFirstName("Pooja");
		empObj.setLastName("Bishnoi");
		empObj.setId("110");
		empObj.setDesignation("QA Engineer");
		empObj.setAddress(addressObj);
		
		Response res =given().contentType(ContentType.JSON).body(empObj)
		.when().post("http://localhost:3000/employeesInfo");
		
		System.out.println(res.getStatusLine());
		System.out.println("************");
		res.prettyPrint();
			
	}

}
