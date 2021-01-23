package org.testing.Utilities;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomString {

	public static String generateRandomString(int length) {
		 	boolean useLetters = true;
		 	boolean useNumbers = false; 
		 	String s = RandomStringUtils.random(length, useLetters, useNumbers);
		 	return s;
	}
}

