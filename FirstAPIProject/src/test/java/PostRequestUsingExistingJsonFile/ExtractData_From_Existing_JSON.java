package PostRequestUsingExistingJsonFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.json.JSONObject;
import org.json.JSONTokener;

public class ExtractData_From_Existing_JSON {

	
	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("../FirstAPIProject/DummyJsonFile.json");
		FileInputStream fi = new FileInputStream(f);
		
		JSONTokener jsTokener = new JSONTokener(fi);
		JSONObject js = new JSONObject(jsTokener);
		
		System.out.println(js.toString());
		
		String firstName = js.getString("firstName");
		System.out.println("Name is: "+firstName);
		
		//JSON Object 
		String postalCode=js.getJSONObject("address").getString("postalCode");
		System.out.println("Postalcode is: "+postalCode);
		
		
		//Json Array
		String type = js.getJSONArray("phoneNumbers").getJSONObject(0).getString("type");
		System.out.println("type is: "+type);
		
	}
	
	
	
}
