package PostRequestUsingExistingJsonFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.regex.Pattern;

import org.json.JSONObject;
import org.json.JSONTokener;

public class DynamicDataExtraction {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("../FirstAPIProject/Data.json");
		FileReader fr = new FileReader(f);
		
		JSONTokener jt = new JSONTokener(fr);
		JSONObject obj = new JSONObject(jt);
		//System.out.println(obj.toString());
		String data = obj.toString();
	
		//method to generate random id
		Random randomObj = new Random();
		int i = randomObj.nextInt(9000000)+100000;    // nextInt(9000000)+100000 is to generate only positive random numbers
		String s= String.valueOf(i);
		
		
        data=data.replaceAll(Pattern.quote("{{firstName}}"), "Shivam");
        data=data.replaceAll(Pattern.quote("{{lastName}}"), "Srivastava");
        data=data.replaceAll(Pattern.quote("{{id}}"), s);
        
  
        
    	System.out.println(data);
		

	}

}
