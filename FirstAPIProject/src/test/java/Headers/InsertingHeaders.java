package Headers;

import static com.jayway.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONObject;
import org.json.JSONTokener;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Header;
import com.jayway.restassured.response.Response;

public class InsertingHeaders {
	public static void main(String[] args) throws FileNotFoundException {
		
		 
		 HashMap<String, String> headersMap = new HashMap<String, String>();
		 headersMap.put("Pragma", "no-cache");
		 headersMap.put("Content-Type", "application/json");
		 headersMap.put("Transfer-Encoding", "chunked");
		 
		 //You can put headers in ArrayList as well
		 
		/** ArrayList<Header> headerList = new ArrayList<Header>();
		 Header h1 = new Header("Pragma", "no-cache");
		 Header h2 = new Header("Content-Type", "application/json");
		 Header h3 = new Header("Transfer-Encoding", "chunked");
		 
		 headerList.add(h1);
		 headerList.add(h2);
		 headerList.add(h3); **/
		 
		 
		 File f = new File("../FirstAPIProject/BodyData.json");
		 FileReader fr = new FileReader(f);
		 JSONTokener jT = new JSONTokener(fr);
		 JSONObject bodyData = new JSONObject(jT);
				 
		 
    
		Response res =given().contentType(ContentType.JSON).body(bodyData).headers(headersMap)
		.when()
		.post("http://localhost:3000/employeesInfo");
		
        System.out.println(res.statusLine());
        System.out.println("********************");
        System.out.println(res.asString());
        
	}

}
