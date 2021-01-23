package org.testing.TestScript;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testing.ResponseValidation.ResponseCodeValidate;
import org.testing.ResponseValidation.ResponseDataValidation;
import org.testing.TestSteps.HTTP_Methods;
import org.testing.Utilities.GenerateRandomID;
import org.testing.Utilities.GenerateRandomString;
import org.testing.Utilities.GenerateReport;
import org.testing.Utilities.JsonFileLoad;
import org.testing.Utilities.JsonVariableReplacement;
import org.testing.Utilities.LogsCapture;
import org.testing.Utilities.PropertiesLoad;
import org.testng.annotations.Test;

import com.jayway.restassured.response.Header;
import com.jayway.restassured.response.Headers;
import com.jayway.restassured.response.Response;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC1 {

	static String idValue;
	static String str;

	@Test
	public void testCase1() throws IOException {

		// taking URI from Properties File
		LogsCapture.captureLogs("TC1", "Load Properties");
		Properties p = PropertiesLoad.loadProperties("../XYZFramework/URI.properties");

		// Loading bodyData from existing json file
		LogsCapture.captureLogs("TC1", "Load body data");
		String bodyData = JsonFileLoad
				.loadJsonObjectFile("../XYZFramework/src/test/java/org/testing/Resources/BodyData.json");

		// providing random value to firstName
		LogsCapture.captureLogs("TC1", "generate random string");
		String randomName = GenerateRandomString.generateRandomString(7);
		String bodyDataAfterReplacingName = JsonVariableReplacement.replaceVariableInJson(bodyData, "firstNameValue",
				randomName);

		// providing random value to id and generating new bodydata
		String randomId = GenerateRandomID.randomIdGeneration();
		String bodyDataAfterReplacingID = JsonVariableReplacement.replaceVariableInJson(bodyDataAfterReplacingName,
				"idValue", randomId);
		// System.out.println(bodyDataAfterReplacingID);

		// hit post request
		HTTP_Methods http = new HTTP_Methods(p);
		Response res = http.postRequest(bodyDataAfterReplacingID, "Employee_URI");

		/*
		 * System.out.println(res.getStatusLine());
		 * System.out.println("***********************************************");
		 * System.out.println(res.asString());
		 */

		// Validate status code
		ResponseCodeValidate.validateResponseCode(201, res);
		System.out.println(res.asString());

		// validate response data
		ResponseDataValidation.validateResponseData(res, randomName, "firstName");

		/**
		 * Getting id Value
		 * 
		 * idValue = res.then().extract().jsonPath().getInt("id");
		 **/

		idValue = res.jsonPath().get("id");
		System.out.println("id Value is: " + idValue);

		str = res.jsonPath().getString("firstName");
		System.out.println("firstName is: " + str);

		// To get response time
		System.err.println("Response time is: " + res.getTime());

		// To get all headers
		Headers headerList = res.getHeaders();
		// System.err.println("Headers are: "+headerList);
		Iterator<Header> allkeys = headerList.iterator();
		while (allkeys.hasNext()) {
			System.err.println(allkeys.next());
		}

		System.out.println(res.sessionId());
		
		ArrayList<Object> al=GenerateReport.reportGeneration("../XYZFramework/myReports.html", "TC1", true);
		
		ExtentTest extentTest =(ExtentTest) al.get(0);
		extentTest.log(LogStatus.INFO, "Report generated successfully");
		extentTest.log(LogStatus.PASS, "Passed test case");
		
		ExtentReports extentReports=(ExtentReports) al.get(1);
		extentReports.endTest(extentTest);
		extentReports.flush();
		extentReports.close();
		

	}

}

