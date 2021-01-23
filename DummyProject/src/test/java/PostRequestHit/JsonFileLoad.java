package PostRequestHit;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonFileLoad {

	public static void loadJsonFile(String filePathName) throws FileNotFoundException {
		File f = new File(filePathName);
		FileReader fr = new FileReader(f);
		JSONTokener jT= new JSONTokener(fr);
		Object obj = jT.nextValue();
		System.out.println(obj.toString());
		//String data =null;
		//System.out.println(data);
		
		
		  if(obj instanceof JSONObject) { obj = new JSONObject(jT);
		  String data =obj.toString(); 
		  System.out.println("obj is JSONObject");
		  }
		  
		  else if (obj instanceof JSONArray) { obj = new JSONArray(jT); 
		  //String data =obj.toString(); 
		  System.out.println("obj is JSONArray");}
		  
		  else { System.out.println("Neither JSONObject nor JSONArray"); }
		 
		//return data;
	}

	public static void main(String[] args) throws FileNotFoundException {
		loadJsonFile("../DummyProject/BodyData.json");
	}
}
