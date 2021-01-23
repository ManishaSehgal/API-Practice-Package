package org.testing.TestScripts;

import org.automationtesting.excelreport.Xl;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class TestCase2 {
	
	@Test
	public void TC2() {
		System.out.println("This is TC2");
	}
	
	@AfterSuite
	public void afterSuite() throws Exception {
		System.out.println("This is after suite method");
		Xl.generateReport("../Reports.xlsx");
	}

}
