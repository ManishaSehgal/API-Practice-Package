package RunTimeTask;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

public class Generate_JSON {

	public static void main(String[] args) throws IOException {
		File f = new File("../RealTimeTasks/db.json");
		FileWriter fw = new FileWriter(f);
		System.out.println("Fw1");
		
		JSONObject jsObj = new JSONObject();
		JSONArray jsArr = new JSONArray();
		jsObj.put("dummyAPI", jsArr);
		System.out.println("fw2");
		
		fw.write(jsObj.toString());
		System.out.println("fw3");
		fw.close();
		System.out.println("fw4");
		
		
		
		
		
		
	}
}
