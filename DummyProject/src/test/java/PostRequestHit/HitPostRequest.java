package PostRequestHit;

import static com.jayway.restassured.RestAssured.*;

import java.io.FileNotFoundException;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class HitPostRequest {

	public static void main(String[] args) throws FileNotFoundException {
		
		String bodyData = JsonFileLoad.loadJsonFile("../DummyProject/BodyData.json");
		
		Response res = given().contentType(ContentType.JSON).body(bodyData)
		.when()
		.post("http://localhost:3000/employeesInfo");
		
		System.out.println(res.statusLine());
		System.out.println("***********************************");
		System.out.println(res.asString());
		

	}

}
