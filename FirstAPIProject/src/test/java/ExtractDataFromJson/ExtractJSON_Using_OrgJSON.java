package ExtractDataFromJson;

import static com.jayway.restassured.RestAssured.given;

import org.json.JSONArray;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class ExtractJSON_Using_OrgJSON {

	public static void main(String[] args) {
		Response res =given().contentType(ContentType.JSON)
				.when().get("http://localhost:3000/employeesInfo");
				
		/*
		 * System.out.println(res.asString());
		 * System.out.println("*****************************************************");
		 */
				JSONArray js = new JSONArray(res.asString());
				System.out.println("Response data is :"+js);
				String id =js.getJSONObject(0).getString("id");
				System.out.println("First record id is: "+id);

	}

}
