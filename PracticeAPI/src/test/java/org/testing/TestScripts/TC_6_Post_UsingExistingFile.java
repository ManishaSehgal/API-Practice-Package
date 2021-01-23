package org.testing.TestScripts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class TC_6_Post_UsingExistingFile {
	
	public static void main(String[] args) throws FileNotFoundException {
	 File f = new File("../PracticeAPI/BodyData.json");
	 FileReader fr = new FileReader(f);
	 JSONTokener jT = new JSONTokener(fr);
	 
	 JSONObject jsObject = new JSONObject(jT);
	
	 
	// System.out.println(jsObject.toString());
	 
	Response res= given().contentType(ContentType.JSON).body(jsObject.toString())
	 .when()
	 .post("http://localhost:3000/employeesInfo");
	
	 System.out.println(res.asString());
	}

}
