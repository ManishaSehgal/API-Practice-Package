package JSONHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;

import static com.jayway.restassured.RestAssured.*;

public class JsonHandling {
	
	public static void main(String[] args) throws ParseException, IOException {
	
	   
	   File f= new File("../XYZProject/src/test/java/Resources/SampleJsonArray.json");
	   FileReader fr = new FileReader(f);
	   
	   Object obj = new JSONTokener(fr).nextValue();
	   
	  // System.out.println(obj.toString());
	   
		
	  if(obj instanceof JSONObject) { 
		  System.out.println("It is a jsonObject"); 
		 // JSONTokener jT = new JSONTokener(fr);
		
		  Response res =given().contentType(ContentType.JSON).body(obj.toString())
		  .when().post("http://localhost:3000/employeesInfo");
		  
		  System.out.println(res.statusLine());
	
	  }
		  
	  else if (obj instanceof JSONArray) {
		  System.out.println("It is a jsonArray");
		  

		  Response res =given().contentType(ContentType.JSON).body(obj.toString())
		  .when().post("http://localhost:3000/employeesInfo");
		  
		  System.out.println(res.statusLine());
		  
		  } 
	  else { 
		  System.out.println("It is neither json object nor json array"); 
		  }
		 
	   
		
	}

}
