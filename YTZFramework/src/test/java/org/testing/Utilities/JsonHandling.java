package org.testing.Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JsonHandling {
	public static void main(String[] args) throws FileNotFoundException {
		
	//}
	
	//public static void jsonHandling(String bodyData, String searchKey, String insertValue) {
		
		File f = new File("../YTZFramework/src/test/java/org/testing/Resources/QuizBodyData.json");
		FileReader fr = new FileReader(f);
		JSONTokener jT = new JSONTokener(fr);
		JSONObject jsObj = new JSONObject(jT);
		//JSONObject jsObj = new JSONObject(bodyData);
	//	JSONArray optionsArr = jsObj.getJSONObject("quiz").getJSONObject("sport").getJSONObject("q1").getJSONArray("options");
		//System.out.println(optionsArr);
		
		Set<String> keySetQuiz= jsObj.getJSONObject("quiz").keySet();
		System.out.println(keySetQuiz);
	    Iterator<String> quizIterator=	keySetQuiz.iterator();
	    while(quizIterator.hasNext()) {
	    	  quizIterator.next();
	    	
	    }
		
			
		
		
	
		
		
	}

}
