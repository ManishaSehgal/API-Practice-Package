package PostRequestUsingExistingJsonFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.JSONArray;
import org.json.JSONTokener;

public class DynamicDataUsing_OrgJson {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f = new File("../FirstAPIProject/DataFile.json");
		FileReader fr = new FileReader(f);
		
		JSONTokener jT= new JSONTokener(fr);
		JSONArray arr = new JSONArray(jT);
		
		Random randomObj = new Random();
		int i = randomObj.nextInt(9000000)+100000;    // nextInt(9000000)+100000 is to generate only positive random numbers
		String s= String.valueOf(i);
		
		//System.out.println(arr.toString());
		
		String data = arr.toString();
		
		String id= "{{id}}";
		int count=0;
		
		//Pattern Matcher
		
	    Matcher m = Pattern.compile(data).matcher(id);
	    
	    while(m.find()) {
	    	count++;
	    }

	    System.out.println(count);
		
		  int size = data.length(); for (int j = 0; j < size; j++) {
		  
		  count = data.split(id, -1).length-1;
		  
		  String temp = data.substring(data.indexOf("{{"), data.indexOf("}}")+2);
		  
		  if (temp.equals(id)) { System.out.println();
		  
		  }
		  
		  }
		 

		
	}

}
