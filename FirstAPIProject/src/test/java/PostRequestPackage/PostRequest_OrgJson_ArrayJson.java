package PostRequestPackage;

import static com.jayway.restassured.RestAssured.*;

import org.json.JSONArray;
import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;





public class PostRequest_OrgJson_ArrayJson {

	public static void main(String[] args) {

		JSONObject phoneNumber1 = new JSONObject();
		phoneNumber1.put("type", "mobile");
		phoneNumber1.put("number", "9387363543");

		JSONObject phoneNumber2 = new JSONObject();
		phoneNumber2.put("type", "landline");
		phoneNumber2.put("numnber", "011-524323");

		JSONArray phoneArray = new JSONArray();
		phoneArray.put(phoneNumber1);
		phoneArray.put(phoneNumber2);

		JSONObject sureshInfoObj = new JSONObject();
		sureshInfoObj.put("firstName", "Suresh");
		sureshInfoObj.put("lastName", "Gautam");
		sureshInfoObj.put("id", "106");
		sureshInfoObj.put("phoneNumbers", phoneArray);

		Response res = given().contentType(ContentType.JSON).body(sureshInfoObj.toString()).log().all()
				.when().post("http://localhost:3000/employeesInfo");

		System.out.println("********************************************");
		System.out.println(res.getStatusLine());




	}

}
