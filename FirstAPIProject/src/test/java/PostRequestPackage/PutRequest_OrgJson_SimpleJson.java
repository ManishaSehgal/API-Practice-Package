package PostRequestPackage;

import static com.jayway.restassured.RestAssured.*;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class PutRequest_OrgJson_SimpleJson {

	public static void main(String[] args) {

		JSONObject obj = new JSONObject();
		obj.put("firstName", "Nilesh");
		obj.put("lastName", "Verma");
		obj.put("id", 3245);



		Response res= given().contentType(ContentType.JSON).body(obj.toString()).log().all()
				.when().post("http://localhost:3000/employeesInfo");

		System.out.println(res.getStatusLine());

	}

}
