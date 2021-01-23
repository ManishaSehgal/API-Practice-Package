package JsonFileType;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonFileType {
	
	public static String loadJsonFile(String filePathName) throws FileNotFoundException {
	File f = new File(filePathName);
	FileReader fr = new FileReader(f);
	//Object obj = new JSONTokener(fr).nextValue();
	// or we can write
	JSONTokener jT= new JSONTokener(fr);
	Object obj = jT.nextValue();
	String data=null;

	if(obj instanceof JSONObject) { 
		JSONObject jsonObj= new JSONObject(jT); 
		data= jsonObj.toString();

		//get random string value 
		//String s = getRandomID();  
		//data =data.replaceAll(Pattern.quote("{{idValue}}"), "110"); 
	}


	else if (obj instanceof JSONArray) { 
		JSONArray jsonArr = new JSONArray(jT);
		data= jsonArr.toString(); 
	}

	else { 
		System.out.println("This json is neither an object of JSONObject nor an object of JSONArray"); 
	}


	return data;

}


}
