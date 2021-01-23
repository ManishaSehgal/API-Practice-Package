package POJO_InArray;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class PostRequest_POJO_InArray {

	public static void main(String[] args) {
		
		Address[] address = new Address[2];
		address[0] = new Address();
		address[0].setHouseNumber("765");
		address[0].setStreetNumber("Chander Nagar");
		address[0].setCity("Panipat");
		address[0].setAreaCode("1210971");

		address[1] = new Address();
		address[1].setHouseNumber("565");
		address[1].setStreetNumber("Chandni Chowk");
		address[1].setCity("Delhi");
		address[1].setAreaCode("110971");
		
		
		EmployeeDetails empObj = new EmployeeDetails();
		empObj.setFirstName("Krishan");
		empObj.setLastName("Kumar");
		empObj.setId("111");
		empObj.setDesignation("System Engineer");
		empObj.setAddress(address);
		
		Response res =given().contentType(ContentType.JSON).body(empObj)
		.when().post("http://localhost:3000/employeesInfo");
		
		System.out.println(res.getStatusLine());
		System.out.println("******************************");
        res.prettyPrint();		
		

	}

}
