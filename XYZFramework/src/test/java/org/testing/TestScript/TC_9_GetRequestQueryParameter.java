package org.testing.TestScript;

import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTP_Methods;
import org.testing.Utilities.PropertiesLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Response;

public class TC_9_GetRequestQueryParameter {
	
	@Test
	public void getRequestWithQueryParameter() throws IOException {
		Properties p = PropertiesLoad.loadProperties("../XYZFramework/URI.properties");
		
		String strValueToSearch = TC1.str;
		
		HTTP_Methods getRequest_With_queryPara = new HTTP_Methods(p);
		
		Response res =getRequest_With_queryPara.getRequestWithQueryParameters("Employee_URI", "firstName", strValueToSearch);
		System.out.println(res.statusLine());
        System.out.println("***********************************");
        System.out.println(res.asString());
		
		
	}

}
