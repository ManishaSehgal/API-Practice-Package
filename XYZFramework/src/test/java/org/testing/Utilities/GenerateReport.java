package org.testing.Utilities;

import java.util.ArrayList;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


public class GenerateReport {
	
	public static ArrayList<Object> reportGeneration(String filePathName, String testCaseName, Boolean flag) {
		
		ArrayList<Object> al = new ArrayList<Object>();
		ExtentReports extentReportsObj = new ExtentReports(filePathName, flag);
		ExtentTest extTestObj = extentReportsObj.startTest(testCaseName);
		
		al.add(extTestObj);
		al.add(extentReportsObj);
		return al;
		
		
		/*
		 * extTestObj.log(LogStatus.PASS, passMsg); extTestObj.log(LogStatus.FAIL,
		 * failMsg);
		 * 
		 * extentReportsObj.endTest(extTestObj); extentReportsObj.flush();
		 */
	}

}
