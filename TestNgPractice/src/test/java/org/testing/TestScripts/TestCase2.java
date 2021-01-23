package org.testing.TestScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class TestCase2 {
	
	@Test
	@Parameters({"employeeID", "employeeName"})
	public void parameterizedMethod(int employeeID, String employeeName) {
		System.out.println("Details of employee are: "+employeeID+ "-" +employeeName);
	}

}
