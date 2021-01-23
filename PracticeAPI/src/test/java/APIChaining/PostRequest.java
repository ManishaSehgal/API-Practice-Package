package APIChaining;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class PostRequest {

	
	public static String post_request(String filePathName) throws FileNotFoundException {
		File f = new File(filePathName);
		FileReader fr = new FileReader(f);
		JSONTokener jT = new JSONTokener(fr);
		
		JSONObject jsOb = new JSONObject(jT);
		
		Response res =given().contentType(ContentType.JSON).body(jsOb.toString())
		.when()
		.post("http://localhost:3000/employeesInfo");
		
		System.out.println(res.getStatusLine());
		System.out.println(res.headers());
		System.out.println(res.asString());
		
		System.out.println("*****************************");
		
		String idValue = res.jsonPath().getString("id");
		System.out.println("Id is: "+idValue);
		
        return idValue;
	}

}
