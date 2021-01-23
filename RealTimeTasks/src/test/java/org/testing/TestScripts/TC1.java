package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import org.testing.Utilities.GettingAllVariablesInJson;
import org.testing.Utilities.LoadJsonFile;

public class TC1 {
	
	public static void main(String[] args) throws FileNotFoundException {

	
	//public static void testCase1() throws FileNotFoundException {
		String bodyData = LoadJsonFile.loadJsonFile("../RealTimeTasks/src/test/java/org/testing/Resources/BodyData.json");
		ArrayList<String> arr = GettingAllVariablesInJson.getAllVariables(bodyData);
	}

}
