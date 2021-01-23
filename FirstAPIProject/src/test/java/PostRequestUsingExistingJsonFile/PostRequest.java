package PostRequestUsingExistingJsonFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class PostRequest {
 
	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("../FirstAPIProject/BodyData.json");
		FileReader fr = new FileReader(f);
		
		JSONTokener jT = new JSONTokener(fr);
		JSONObject jsObj = new JSONObject(jT);
		
		System.out.println(jsObj.toString());
		
		Response res= given().contentType(ContentType.JSON)
		.body(jsObj)
		.when()
		.post("http://localhost:3000/employeesInfo");
		
		System.out.println(res.getStatusLine());
		
		
	}
}
