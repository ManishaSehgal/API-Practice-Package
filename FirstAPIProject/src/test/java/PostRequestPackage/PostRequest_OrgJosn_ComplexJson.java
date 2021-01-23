package PostRequestPackage;

import static com.jayway.restassured.RestAssured.*;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;


public class PostRequest_OrgJosn_ComplexJson {

	public static void main(String[] args) {
		
		JSONObject addressObj = new JSONObject();
		addressObj.put("houseNo", "635");
		addressObj.put("stree tNo", "8");
		addressObj.put("area", "Rohini");
		addressObj.put("city", "Delhi");
		
		JSONObject ajayInfoObj = new JSONObject();
		ajayInfoObj.put("firstName", "Ajay");
		ajayInfoObj.put("lastName", "Sharma");
		ajayInfoObj.put("id", "105");
		ajayInfoObj.put("address", addressObj);
		
		Response res = given().contentType(ContentType.JSON).body(ajayInfoObj.toString()).log().all()
				       .when().post("http://localhost:3000/employeesInfo");
		
		System.out.println("********************************************");
		System.out.println(res.getStatusLine());
		

	}

}
