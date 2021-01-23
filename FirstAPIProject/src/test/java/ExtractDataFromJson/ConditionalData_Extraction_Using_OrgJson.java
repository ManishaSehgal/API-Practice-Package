package ExtractDataFromJson;

import static com.jayway.restassured.RestAssured.*;

import org.json.JSONArray;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

public class ConditionalData_Extraction_Using_OrgJson {

	public static void main(String[] args) {
		
	   Response res=	given().contentType(ContentType.JSON)
		.when().get("http://localhost:3000/employeesInfo");
	   
	   JSONArray arr = new JSONArray(res.asString());
	   String firstName ="Paramjeet";
	   String lastName ="Kaur";
	   
	   int size = arr.length();
	   
	   for(int i=0; i<size; i++) {
		   String fName = arr.getJSONObject(i).getString("firstName");
		   String lName = arr.getJSONObject(i).getString("lastName");
		   
		   if((fName.equals(firstName))&&(lName.equals(lastName))) {
			   System.out.println(arr.getJSONObject(i).getString("id"));
		   }
		   
	   }

	}

}
