package org.testing.TestScripts;

import java.io.IOException;
import java.util.Properties;

import org.testing.ResponseValidation.DataValidation;
import org.testing.ResponseValidation.StatusCodeValidation;
import org.testing.TestSteps.HTTP_Methods;
import org.testing.Utilities.JsonVariableReplacement;
import org.testing.Utilities.LoadJsonFile;
import org.testing.Utilities.LoadPropertiesFile;
import org.testing.Utilities.RandomInt_Generation;
import org.testing.Utilities.RandomString_Generation;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC1_PostRequest {
	
	static String idValue;
	static String firstNameVal;
	
	@Test
	public void TC1() throws IOException {
		Properties p = LoadPropertiesFile.loadProperties("../YTZFramework/Environment.properties");
		String bodyData =LoadJsonFile.loadJsonFile("../YTZFramework/src/test/java/org/testing/Resources/BodyData.json");
		System.out.println(bodyData);
		
		//Generate Random ID
		String id =RandomInt_Generation.random_Id();
		String updatedBodyDataAfterId =JsonVariableReplacement.replaceJsonVariaable(bodyData, "idValue", id);
		
		//Generate Random String
		String str = RandomString_Generation.random_String(8);
		String updatedBodyDataAfterFirstName = JsonVariableReplacement.replaceJsonVariaable(updatedBodyDataAfterId,"firstNameValue", str);
	    System.out.println("******************Body data is********************");
	    System.out.println(updatedBodyDataAfterFirstName);
	
		HTTP_Methods postRequestObj = new HTTP_Methods(p);
		Response res =postRequestObj.postRequest("Employee_URI", updatedBodyDataAfterFirstName);
		
		
		StatusCodeValidation.validateStatusCode(res, 201, res.getStatusCode());
		DataValidation.dataValidation(res, str, "firstName");
		
		idValue = res.jsonPath().get("id");
		firstNameVal = res.jsonPath().get("firstName");
	}

}
