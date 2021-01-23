package ExtractDataFromJson;

import static com.jayway.restassured.RestAssured.*;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

public class ExtractingConditionalDetailsFromJson {

	public static void main(String[] args) {
		
		Response res =given().contentType(ContentType.JSON)
		.when().get(" http://localhost:3000/employeesInfo");
		System.out.println(res.getStatusLine());
		
		System.out.println("*****************");
		
		//res.prettyPrint();
		
		JsonPath js = new JsonPath(res.asString());
		int size = js.getInt("employeesInfo.size()");
		System.out.println(size);
		
		String firstName ="Ajay";
		String temp ="";
		
		for(int i=0; i<size; i++)
		{
			temp = js.getString("["+i+"].firstName");
			if(temp.equals(firstName)) {
				System.out.println(js.getString("["+i+"]"));
				break;
			}
		}
		
		

	}

}
