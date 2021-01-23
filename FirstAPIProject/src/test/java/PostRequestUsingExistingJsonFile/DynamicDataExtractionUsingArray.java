package PostRequestUsingExistingJsonFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.regex.Pattern;

import org.json.JSONArray;
import org.json.JSONTokener;
import org.omg.CORBA.DATA_CONVERSION;


public class DynamicDataExtractionUsingArray {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("../FirstAPIProject/DataFile.json");
		FileReader fr = new FileReader(f);
		
		JSONTokener jT= new JSONTokener(fr);
		JSONArray arr = new JSONArray(jT);
		
		String body = arr.toString();
		//System.out.println(body);
	
		//  body=body.replaceAll(Pattern.quote("{{firstName}}"), "Shivam");
		//  body=body.replaceAll(Pattern.quote("{{lastName}}"), "Srivastava");
		  body=body.replaceAll(Pattern.quote("{{id}}"), "103");
		   
		   System.out.println(body);

	}

}
