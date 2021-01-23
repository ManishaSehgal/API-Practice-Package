package org.testing.Utilities;

import java.util.regex.Pattern;

public class JsonVariableReplacement {
	
	public static String replaceJsonVariaable(String bodyData, String valueToreplace, String replacedValue) {
		
		bodyData = bodyData.replaceAll(Pattern.quote("{{"+valueToreplace+"}}"), replacedValue);
		return bodyData;
	}

}
