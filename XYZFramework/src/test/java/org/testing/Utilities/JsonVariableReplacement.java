package org.testing.Utilities;


import java.io.FileNotFoundException;
import java.util.regex.Pattern;



public class JsonVariableReplacement {
	
	public static String replaceVariableInJson(String bodyData, String variableName, String variableValue) throws FileNotFoundException {
		bodyData = bodyData.replaceAll(Pattern.quote("{{"+variableName+"}}"), variableValue);
		return bodyData;			
	}

}
