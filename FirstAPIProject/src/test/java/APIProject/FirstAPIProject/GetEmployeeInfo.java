package APIProject.FirstAPIProject;

import static com.jayway.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import com.jayway.restassured.http.ContentType;

public class GetEmployeeInfo {

	public static void main(String[] args) {

		Map<String, String> map = given().contentType(ContentType.JSON)
				.when().get("http://localhost:3000/employeesInfo/101")
				.then().extract().path("address");


		//iterate hashMap
		
		for(Map.Entry<String, String> entry: map.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());

		}



	}

}
