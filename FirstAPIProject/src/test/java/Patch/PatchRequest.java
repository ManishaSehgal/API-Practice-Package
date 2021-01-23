package Patch;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class PatchRequest {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		/*
		 * File f = new File("../FirstAPIProject/src/test/java/Patch/PatchFile.json");
		 * FileReader fr = new FileReader(f); JSONTokener jT = new JSONTokener(fr);
		 * JSONObject obj = new JSONObject(jT);
		 */
		
		String jsonString = "{\r\n" + 
				"    \"firstName\" : \"Amod\",\r\n" + 
				"    \"lastName\" : \"Mahajan\"}";
		
		Response res =given().contentType(ContentType.JSON).body(jsonString)
		.when()
		.patch("http://localhost:3000/employeesInfo/5810328");
		
		System.out.println(res.statusLine());
		System.out.println("******************************");
		System.out.println(res.asString());
		
		
		
	}

}
