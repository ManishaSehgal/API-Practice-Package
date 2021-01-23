package ExtractDataFromJson;

import static com.jayway.restassured.RestAssured.*;

import java.util.ArrayList;

import org.json.JSONArray;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class ExtractAll_IDs_Using_OrgJSON {

	public static void main(String[] args) {
		
		Response res= given().contentType(ContentType.JSON)
		.when().get("http://localhost:3000/employeesInfo");
		
		JSONArray js= new JSONArray(res.asString());
		int size = js.length();
		//String id="";
		
		for(int i=0; i<size; i++) {
		
			String id = js.getJSONObject(i).getString("id");
			System.out.println(id);
		}
				
		

	}

}
