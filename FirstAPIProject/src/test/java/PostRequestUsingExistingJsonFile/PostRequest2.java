package PostRequestUsingExistingJsonFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;



public class PostRequest2 {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("../FirstAPIProject/DataFile.json");
		FileReader fr = new FileReader(f);
		
		JSONTokener jt = new JSONTokener(fr);
		JSONObject obj = new JSONObject(jt);
		//System.out.println(obj.toString());
		String data = obj.toString();
		
		data=data.replaceAll(Pattern.quote("{{firstName}}"), "Shivam");
		
		data=data.replaceAll(Pattern.quote("{{lastName}}"), "Mehta");
		data=data.replaceAll(Pattern.quote("{{id}}"), "89");
		
		System.out.println(data);
		
	}
}
