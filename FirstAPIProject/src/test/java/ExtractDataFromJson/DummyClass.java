package ExtractDataFromJson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class DummyClass {

	public static void main(String[] args) throws FileNotFoundException {
	
		File f = new File("../FirstAPIProject/DummyJsonFile.json");
		FileReader fr = new FileReader(f);
		Object obj= new JSONTokener(fr).nextValue();
		
		if(obj instanceof JSONObject) {
			System.out.println("I am obj of JSONObject");
		}
		else if(obj instanceof JSONArray) {
			System.out.println("I am obj of JSONArray");
		}
		else {
			System.out.println("Nothing");
		}
	

	}

}
