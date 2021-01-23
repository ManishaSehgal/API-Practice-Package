package PutRequestPackage;

import static com.jayway.restassured.RestAssured.*;

import org.json.JSONObject;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;


public class PutSimpleJson_OrgJson {

	public static void main(String[] args) {
	
    JSONObject obj = new JSONObject();
    obj.put("firstName", "Hitesh");
    obj.put("lastName", "Grover");
    obj.put("id", "103");
    
   Response res= given().contentType(ContentType.JSON).body(obj)
    .when().put("http://localhost:3000/employeesInfo/103");
   
   System.out.println(res.getStatusLine());
   System.out.println(res.asString());
    
    
	}

}
